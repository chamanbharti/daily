package com.applicationContextAware.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanFactoryAwareImpl implements BeanFactoryAware{

	private BeanFactory beanFactory;
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory(BeanFactory beanFactory) called by the Spring Container:");
		this.beanFactory= beanFactory;
		
	}
	
	public void displayEmployeeDetails() {
		Employee employee = beanFactory.getBean("employee",Employee.class);
		System.out.println("Got employee object from BeanFactory(Spring Container) = "+employee);
		System.out.println("is employee object Singleton? ="+beanFactory.isSingleton("employee"));
		//System.out.println("is employee object Singleton? ="+applicationContext.isSingleton(employee.toString()));
	}


}

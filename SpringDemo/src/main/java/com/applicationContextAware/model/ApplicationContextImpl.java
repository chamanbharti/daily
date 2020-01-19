package com.applicationContextAware.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextImpl implements ApplicationContextAware{

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext(ApplicationContext applicationContext) called by the Spring Container:");
		this.applicationContext= applicationContext;
	}
	
	public void displayEmployeeDetails() {
		Employee employee = applicationContext.getBean("employee",Employee.class);
		System.out.println("Got employee object from ApplicationContext(Spring Container) = "+employee);
		System.out.println("is employee object Singleton? ="+applicationContext.isSingleton("employee"));
		//System.out.println("is employee object Singleton? ="+applicationContext.isSingleton(employee.toString()));
	}

}

package com.applicationContextAware;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.applicationContextAware.model.ApplicationContextImpl;
import com.applicationContextAware.model.BeanFactoryAwareImpl;
import com.applicationContextAware.model.BeanNameAwareImpl;

public class EmployeeTest {

	public static void main(String[] args) {
		
//		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextAware.xml");
//		BeanFactoryAwareImpl applicationContextImpl = applicationContext.getBean("applicationContextAware", BeanFactoryAwareImpl.class);
//		applicationContextImpl.displayEmployeeDetails();
//		applicationContext.close();
		
//		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanFactoryAware.xml");
//		BeanFactoryAwareImpl applicationContextImpl = applicationContext.getBean("beanFactoryAware", BeanFactoryAwareImpl.class);
//		applicationContextImpl.displayEmployeeDetails();
//		applicationContext.close();
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanNameAware.xml");
		BeanNameAwareImpl beanNameAwareImpl = applicationContext.getBean("beanNameAware", BeanNameAwareImpl.class);
		System.out.println("beanNameAwareImpl = "+beanNameAwareImpl);
		applicationContext.close();
	}
}

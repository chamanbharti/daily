package com.applicationContextAware.model;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareImpl implements BeanNameAware{

	@Override
	public void setBeanName(String beanName) {
		System.out.println("setBeanName(String beanName) is called by the Spring Container");
		System.out.println("Bean name = "+beanName);
		
	}
	

}

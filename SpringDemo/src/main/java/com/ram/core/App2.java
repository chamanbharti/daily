package com.ram.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.model.Employee2;

public class App2
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("---------------------------------------");

		Employee2 employee2 = context.getBean("employee2", Employee2.class);
		System.out.println("Got employee2 object from the ApplicationContext(Spring Container)");

		System.out.println(employee2);

		context.close();
	}

}

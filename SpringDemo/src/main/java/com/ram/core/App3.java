package com.ram.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.model.Employee3;

public class App3
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("---------------------------------------");

		Employee3 employee3 = context.getBean("employee3", Employee3.class);
		System.out.println("Got employee3 object from the ApplicationContext(Spring Container)");

		System.out.println(employee3);

		context.close();
	}

}

package com.ram.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.model.Employee3;
import com.ram.model.Employee4;
import com.ram.model.Fruit;

public class App4
{
	public static void main(String[] args)
	{
//		ConfigurableApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("---------------------------------------");

		Employee4 employee4 = context.getBean("employee4", Employee4.class);
		System.out.println("Got employee object from the ApplicationContext(Spring Container) = "+employee4);
		
		Fruit fruit = context.getBean("fruit", Fruit.class);
		System.out.println("Got fruit object from the ApplicationContext(Spring Container) = "+ fruit);
		
		context.registerShutdownHook();
	}

}

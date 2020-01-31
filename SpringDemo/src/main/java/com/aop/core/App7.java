package com.aop.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.EmployeeService;

public class App7
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("aroundAdvice.xml");

		System.out.println("---------------------------------------");

		EmployeeService employeeService = context.getBean("employeeServiceProxy",EmployeeService.class);
		
		employeeService.getEmployeeName();
		System.out.println("---------------------------------------");
		employeeService.getEmployeeAge();
		System.out.println("---------------------------------------");
		employeeService.displayEmployeeAddress();
	}

}

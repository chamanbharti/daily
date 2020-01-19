package com.ram.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee4
{
	private String name;

	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return "Employee [name=" + name + "]";
	}

}

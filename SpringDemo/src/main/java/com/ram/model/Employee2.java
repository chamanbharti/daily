package com.ram.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee2
{
	private int id;
	private String name;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void init() throws Exception
	{
		System.out.println("inside init() inside init() after Properties are Set like afterPropertiesSet().  ");
	}

	public void cleanUp() throws Exception
	{
		System.out.println("Inside cleanUp(), performed clean up tasks like destroy(), Performed clean up tasks.");
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

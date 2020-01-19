package com.ram.model;

public class Fruit {

	private String name;

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Fruit [name=" + name + "]";
	}
}

package com.aop.service;

public class EmployeeService {

//	public void displayEmployeeInfo() {
//		System.out.println("Display Employee Information");
//	}
//	
//	public String getEmployeeName(int age) {
//		System.out.println("Get Employee Information");
//		if(age == 28) {
//			return "Chaman";
//		}
//		if(age > 28) {
//			throw new ArithmeticException("Not a valid age");
//		}
//		return "Bharti";
//	}
	
	public String getEmployeeName() {
		System.out.println("Get Employee Name");
		return "Bharti";
	}
	public int getEmployeeAge() {
		System.out.println("Get Employee Age");
		return 28;
	}
	
	public String displayEmployeeAddress() {
		System.out.println("Display Employee Address");
		return "All, East Street";
	}
}

package com.oops.basics;

public class Employee {
	String empName;
	int empId;
	double salary;

	void getDetails() {
		System.out.println("Name "+empName);
		System.out.println("ID "+empId);
		System.out.println("salary "+salary);	
		}
	String greet(String message) {
		return message +empName;
	}
}

package com.oops.inheritance;

public class InEmployee {

	String empName;
	int empId;
	
	
	public InEmployee() {
		
	}
	public InEmployee(String empName,int empId) {
		super();
		this.empName = empName;
		this.empId =empId;
	}

	void getDetails() {
		System.out.println(empId+" "+empName);
	}
}

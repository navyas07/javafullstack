package com.oops.inheritance;

public class InManager extends InEmployee{
double salary;

public InManager(String empName, int empId, double salary) {
	super(empName, empId);
	this.salary = salary;
}
void getDetails() {
	System.out.println(empId+" "+empName+" "+salary);
}
}

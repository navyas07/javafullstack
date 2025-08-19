package com.overload.question1;

public class Employee {
	String empName;
	String designation;

	public Employee(String empName, String designation) {
		super();
		this.empName = empName;
		this.designation = designation;
	}

	void calcBonus(double basicAllowance) {
		System.out.println("Basic allowance");
	}

	void calcBonus(double basicAllowance, String gift) {
		System.out.println("Basic allowance and gifts");

	}

	void calcBonus(double basicAllowance, String gift, double houseAllowance) {
		System.out.println("Basic allowance, gifts and houseAllowance");
	}
}

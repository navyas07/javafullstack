package com.abstraction.question1;

public abstract class Employee {
	String empName;
	double salary;
	int empId;
	final String COMPANYNAME = "Shristi Tech Academy";

	public Employee(String empName, double salary, int empId) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	}

	void printDetails() {
		System.out.println("Employee Name " + empName);
		System.out.println("Employee salary " + salary);
		System.out.println("Employee ID " + empId);
		System.out.println(COMPANYNAME);
	}

	abstract void calcBonus(double amount);

	String[] showCourses() {
		return new String[] { "Java", "Python" };
	}

	private void officeHours() {
		System.out.println("14 hours per day");
	}

	abstract void showProjects();

	final void showRules() {
		officeHours();
		System.out.println("leave policies");
		System.out.println("OD policies");
	}
}

package com.oops.basics;

public class Student {
	String studentName;
	String department;
	
	Student(String StudentName,String department){
		studentName=StudentName;
		this.department=department;
	}
	
	void getDetails() {
		System.out.println("Name "+studentName);
		System.out.println("Department "+department);
		
	}

}

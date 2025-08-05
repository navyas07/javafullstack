package com.basics.question3;

public class Student {

	String name;
	String department;
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	void printDetails(String name, String department) {
		System.out.println("Student name :"+name);
		System.out.println("Student department :"+department);
	}
	void getGrades(int[] marks) {
		String grade = null;
		double sum=0;
		double average=0;
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];	
		}
		System.out.println("The total sum of marks is "+sum);
		average=sum/marks.length;
		System.out.println("The average is "+average);
	
		if(average<=100 && average>=90) {
			grade="A";
		}else if(average<=90 && average>=80) {
			grade="B";
		}else if(average<=80 && average>=70) {
			grade="C";
		}else if(average<=70 && average>=60) {
			grade="D";
		}else if(average<=59 && average>=50) {
			grade="E";
		}else {
			grade="FAIL";
		}
		System.out.println("The grade is "+ grade);
		}
	
}

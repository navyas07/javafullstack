package com.basics.question3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name");
		String name=sc.next();
		System.out.println("Enter student department");
		String department=sc.next();
		System.out.println("Enter marks");
		int []marks=new int[4];
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		Student student1=new Student(name,department);
		student1.printDetails(name, department);
		student1.getGrades(marks);
		sc.close();
	}

}

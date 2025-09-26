package com.training.question1;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		System.out.println("Student/Employee");
		Scanner scanner=new Scanner(System.in);
		String user=scanner.next();
		if(user.equalsIgnoreCase("Student")) {
			Institute institute=new StudentCourses();
			institute.showCourses();
		}else if (user.equalsIgnoreCase("Employee")) {
			Institute institute=new EmployeeCourses();
			institute.showCourses();
		}
		scanner.close();
	}

}

package com.courseapp.main;

import java.util.Scanner;

import com.courseapp.service.Backend;
import com.courseapp.service.Cloud;
import com.courseapp.service.FrontEnd;
import com.courseapp.service.ICourse;

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice -f/b/c");
		String choice = sc.next();
		ICourse course = null;
		switch (choice.toUpperCase()) {
		case "F":
			course = new FrontEnd();
			break;
		case "B":
			course = new Backend();
			break;
		case "C":
			course = new Cloud();
			break;
		default:
			System.out.println("Wrong choice");
		}
		if (course != null) {
			String[] courses = course.showCourses();
			for(int i=0;i<courses.length;i++) {
			System.out.println(courses[i]);
			}
		}
		sc.close();

	}

}

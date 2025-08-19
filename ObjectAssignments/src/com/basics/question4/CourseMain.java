package com.basics.question4;

import java.util.Scanner;

public class CourseMain {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the trainer names");
		String []trainer=new String[4];
		for(int i=0;i<trainer.length;i++) {
			trainer[i]=sc.next();
		}
		sc.close();
		
		Training training=new Training();
		training.showTrainers(trainer);
		System.out.println("\nAvailable Courses:");
        String[] courses = training.showCourses();
        for (String course : courses) {
            System.out.println("- " + course);
        }

	}

}

package com.basics.question4;

public class Training {

		String[] showCourses() {

			String courses[]= {"Java","Backend","Fullstack"};
			return courses;
	}
		 void showTrainers(String... names) {
		        System.out.println("Trainer Names:");
		        for (String name : names) {
		            System.out.println("- " + name);
		        }
		    }

}

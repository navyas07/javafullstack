package com.training.question1;

public class StudentCourses implements Institute{

	@Override
	public String[] showCourses() {
		System.out.println("Jenkins, Agile, Cloud, spring");
		return new String [] {"Jenkins", "Agile", "Cloud", "spring"};
	}

}

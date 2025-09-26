package com.training.question1;

public class EmployeeCourses implements Institute{

	@Override
	public String[] showCourses() {
		System.out.println("python, java, angular, spring");
		return new String [] {"python", "java", "angular", "spring"};
	}

}

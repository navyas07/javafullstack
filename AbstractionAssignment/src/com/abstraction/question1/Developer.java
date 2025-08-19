package com.abstraction.question1;

public class Developer extends TeamLead {

	String hobbies[];

	public Developer(String empName, double salary, int empId, String[] hobbies) {
		super(empName, salary, empId);
		this.hobbies = hobbies;
	}

    @Override
    String[] showCourses() {
        String[] courses = {"Java", "Spring Boot", "Microservices"};
        return courses;
    }
    
	@Override
	void showProjects() {
		System.out.println("Developer works");
	}

	void showHobbies() {
		for (String hobby : hobbies) {
			System.out.println("Hobby is " + hobby);
		}
	}
}

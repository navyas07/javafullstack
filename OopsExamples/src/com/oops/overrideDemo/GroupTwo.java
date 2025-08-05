package com.oops.overrideDemo;

public class GroupTwo extends Project {

	public GroupTwo(String clientName, String duration, String tLName) {
		super(clientName, duration, tLName);
	}

	@Override
	void projectAssigned() {
		System.out.println("GroupTwo project");
	}

	void coursesAssigned(String... courses) {
		for (String course : courses) {
			System.out.println(course);
		}
	}

}

package com.courseapp.service;

public class Backend implements ICourse {
	public String[] showCourses() {
		return new String[] {"java backend", "python backend"};
	}

}

package com.courseapp.service;

public class Cloud implements ICourse {

	public String[] showCourses() {
		return  new String[]{"aws", "azure","gcp"};
	}
}

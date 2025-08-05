package com.oops.abstraction;

public class WebCourses extends CourseDetails {

	@Override
	String[] showCourses() {

		return new String[] { "Html", "Css", "JS" };
	}

	void showProjects() {
		System.out.println("Static pages");
		System.out.println("contact forms");

	}

	@Override
	void certificationsAllowed() {
		// TODO Auto-generated method stub
		System.out.println("In webcourses");
	}
}

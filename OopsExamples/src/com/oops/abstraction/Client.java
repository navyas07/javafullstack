package com.oops.abstraction;

public class Client {

	public static void main(String[] args) {

		CourseDetails courseDetails=new WebCourses();
		String[] courses=courseDetails.showCourses();
		for(String course:courses) {
			System.out.println(course);
		}
		courseDetails.certificationsAllowed();
	 
		WebCourses web =(WebCourses) courseDetails;
		web.showProjects();
		System.out.println();
		
		courseDetails=new JavaStack();
		courseDetails.showCourses();
		courseDetails.certificationsAllowed();
		System.out.println();
		
		JavaStack javaStack=(JavaStack) courseDetails;
		javaStack.courseTypes();
		javaStack.printDetails();
		System.out.println();
		
		FullStackCourses ref=javaStack;
		ref.certificationsAllowed();
		ref.courseTypes();
		ref.showCourses();
		
	}

}

package com.training.question1;

import java.util.Objects;

public class Course {

	private String courseNameString;
	private String typeString;
	
	
	public Course(String courseNameString, String typeString) {
		super();
		this.courseNameString = courseNameString;
		this.typeString = typeString;
	}
	public String getCourseNameString() {
		return courseNameString;
	}
	public void setCourseNameString(String courseNameString) {
		this.courseNameString = courseNameString;
	}
	public String getTypeString() {
		return typeString;
	}
	public void setTypeString(String typeString) {
		this.typeString = typeString;
	}
	@Override
	public String toString() {
		return "Course [courseNameString=" + courseNameString + ", typeString=" + typeString + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseNameString, typeString);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseNameString, other.courseNameString) && Objects.equals(typeString, other.typeString);
	}
	
}

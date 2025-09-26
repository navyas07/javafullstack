package com.io.demos;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private int studentId;
	private transient String department;
	
	public Student() {
		super();
	}

	public Student(String name, int studentId, String department) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", department=" + department + "]";
	}
	
	

}

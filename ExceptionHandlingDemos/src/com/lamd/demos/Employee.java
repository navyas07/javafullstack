package com.lamd.demos;

import java.util.Objects;

public class Employee {

	private String empName;
	private int empId;
	private String city;
	@Override
	public int hashCode() {
		return Objects.hash(city, empId, empName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(city, other.city) && empId == other.empId && Objects.equals(empName, other.empName);
	}
	public Employee(String empName, int empId, String city) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", city=" + city + "]";
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

package com.abstraction.question1;

public class Manager extends Employee{

	String activity;

	public Manager(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId);
		this.activity = activity;
	}
	
	 void funClub(){ 
		   System.out.println("Activity "+activity); 
		 }


	 @Override
	 void calcBonus(double amount) {
		 System.out.println("Manager Bonus: " + (salary + amount + 5000));		
	 }


	 @Override
	 void showProjects() {
	      System.out.println("Manager handles multiple client projects and team coordination.");
	 }
	 
	    @Override
	    String[] showCourses() {
	        String[] courses = {"Leadership", "Agile Management", "Communication"};
	        return courses;
	    }
}

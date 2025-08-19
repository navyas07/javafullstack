package com.abstraction.question1;

public abstract class TeamLead extends Employee{

	public TeamLead(String empName, double salary, int empId) {
		super(empName, salary, empId);
	}
	

	 @Override
	 void calcBonus(double amount) {
		 System.out.println("TeamLead Bonus: " + (salary + amount + 3000));		
	 }

	 void corporateServices(){
		 System.out.println("Corporate services");
	 } 
	 
}

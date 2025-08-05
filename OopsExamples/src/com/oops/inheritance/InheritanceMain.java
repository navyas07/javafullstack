package com.oops.inheritance;

public class InheritanceMain {

	public static void main(String[] args) {

		InEmployee employee=new InEmployee("Raju",10);
		employee.getDetails();
		InManager manager=new InManager("Kevin", 20, 200);
		manager.getDetails();
	}
}

package com.oops.abstractionDemo;

public class Branch1 extends Bank {

	@Override
	public void carLoan() {

		System.out.println("Car loan in branch1");
	}

	@Override
	public void homeLoan() {
		System.out.println("Home loan in branch1");

	}

	@Override
	public void educationLoan() {
		System.out.println("Education loan in branch1");

	}

	// own method
	void payDetails() {
		System.out.println("Payment for employees");
	}

}

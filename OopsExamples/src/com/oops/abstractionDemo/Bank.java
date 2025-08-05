package com.oops.abstractionDemo;

public abstract class Bank {

	public abstract void carLoan();

	public abstract void homeLoan();

	public abstract void educationLoan();

	final void adminDetails() {
		System.out.println("Rules for bank employees");
	}
}

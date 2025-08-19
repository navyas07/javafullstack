package com.inheritance.question2;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
		System.out.println("The current balance " + balance);
	}
	void withDraw(double amount) {
		System.out.println("Current Withdraw " + amount);
		amount = balance - amount;
		System.out.println("The balance after Current withdrawal " + amount);
	}

	void deposit(double amount) {
		System.out.println("Current Deposit " + amount);
		amount = balance + amount;
		System.out.println("The balance after Current deposit " + amount);
	}


}

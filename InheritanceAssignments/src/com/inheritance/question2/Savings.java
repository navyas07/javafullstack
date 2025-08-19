package com.inheritance.question2;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
		System.out.println("The savings balance " + balance);
	}

	void withDraw(double amount) {
		System.out.println("Savings Withdraw " + amount);
		amount = balance - amount;
		System.out.println("The balance after savings withdrawal " + amount);
	}

	void Deposit(double amount) {
		System.out.println("Savings Deposit " + amount);
		amount = balance + amount;
		System.out.println("The balance after savings deposit " + amount);
	}

}

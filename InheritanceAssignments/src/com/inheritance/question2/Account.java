package com.inheritance.question2;

public class Account {

	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	void withDraw(double amount) {
		System.out.println("Withdraw "+amount);
		amount=balance-amount;
		System.out.println("The balance after withdrawal "+amount);
	}
	
	void deposit(double amount) {
		System.out.println("Deposit "+amount);
		amount=balance+amount;
		System.out.println("The balance after deposit "+amount);
	}
	double getBalance() {
		System.out.println("The balance is "+balance);
		return balance;
	}
}

package com.basics.question2;

public class Bank {

	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	
	void withdraw(double amount) {
		System.out.println("Balance before withdrawal is "+balance);
		balance=balance-amount;
		System.out.println("Balance after withdrawal is "+balance);
	}
	void deposit(double amount) {
		System.out.println("Balance before deposit is "+balance);
		balance=balance+amount;
		System.out.println("Balance after deposit is "+balance);
	}
	double getBalance() {
		return balance;
	}
}

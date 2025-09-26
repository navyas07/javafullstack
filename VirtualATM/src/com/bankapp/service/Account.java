package com.bankapp.service;

public abstract class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	abstract void withdraw(double amount);

	abstract void deposit(double amount);

	public double getBalance() {
		System.out.println("Balance is "+balance);
		return balance;
	}

}

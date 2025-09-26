package com.bankapp.service;

public class Current extends Account {
    int transactionsCount = 0;

	public Current(double balance) {
		super(balance);
	}

	@Override
	public void withdraw(double amount) {
		 if (transactionsCount >= 20) {
	            System.out.println("Transaction limit reached (20 per day).");
	            return;
	        }
	        if (amount <= balance && amount > 0) {
	            balance -= amount;
	            transactionsCount++;
	            System.out.println("Withdrawn " + amount + " from Current Account.");
	            System.out.println("Balance in Current Account after withdrawn is "+balance);

	        } else {
	            System.out.println("Insufficient balance or invalid amount.");
	        }	}

	@Override
	public void deposit(double amount) {
	       if (transactionsCount >= 20) {
	            System.out.println("Transaction limit reached (20 per day).");
	            return;
	        }
	        if (amount > 0) {
	            balance += amount;
	            transactionsCount++;
	            System.out.println("Deposited " + amount + " into Current Account.");
	            System.out.println("Balance in Current Account after deposit is "+balance);

	        } else {
	            System.out.println("Invalid deposit amount.");
	        }	}

	public void transactionsAllowed() {
		System.out.println("Allow 20 transactions per day");
	}

}

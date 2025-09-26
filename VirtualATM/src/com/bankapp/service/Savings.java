package com.bankapp.service;

public class Savings extends Account{

	@Override
	public void withdraw(double amount) {
	      if (amount <= balance && amount > 0) {
	            balance -= amount;
	            System.out.println("Withdrawn " + amount + " from Savings Account.");
	            System.out.println("Balance in Savings Account after withdrawn is "+balance);

	        } else {
	            System.out.println("Insufficient balance or invalid amount.");
	        }
	      }

	@Override
	public void deposit(double amount) {
	      if (amount > 0) {
	            balance += amount; // add 2% bonus on deposit
	            System.out.println("Deposited " + amount + " into Savings Account.");
	            System.out.println("Balance in Savings Account after deposit is "+balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }		
	} 
	public Savings(double balance) {
		super(balance);
	}

	public void showDepositSchemes(){ 
		System.out.println("Reccuring Deposit, Fixed Deposit");
	}
	
}

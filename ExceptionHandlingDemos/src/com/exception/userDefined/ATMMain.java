package com.exception.userDefined;

public class ATMMain {

	public static void main(String[] args) {

		System.out.println("In ATM");
		BankAccount bank = new BankAccount(5000);
		try {
			bank.withdraw(4000);
			System.out.println("Amount withdrawn successfully");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("Technical glitch");
			System.out.println("Goodbye");
		}
	}

}
 
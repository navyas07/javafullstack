package com.basics.question2;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Withdraw or Deposit");
		String option = sc.next();
		System.out.println("Enter the amount to "+option);
		Double amount = sc.nextDouble();
		Double balance=5000.0;
		Bank bank = new Bank(balance);
		switch (option.toUpperCase()) {
		case ("WITHDRAW"):
			bank.withdraw(amount);
			break;
		case ("DEPOSIT"):
			bank.deposit(amount);
			break;
		}
		sc.close();
	}

}

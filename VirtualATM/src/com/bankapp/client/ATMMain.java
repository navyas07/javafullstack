package com.bankapp.client;

import java.util.Scanner;

import com.bankapp.service.Account;
import com.bankapp.service.Current;
import com.bankapp.service.Savings;

public class ATMMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double balance=5000.0;
		System.out.println("Select account type Savings/Current");
		String choice = scanner.next();
		if (choice.equalsIgnoreCase("Savings")) {
			System.out.println("WithDraw/Deposit/GetBalance");
			String choice2 = scanner.next();

			Savings savings = new Savings(balance);
			if (choice2.equalsIgnoreCase("Withdraw")) {
				System.out.println("Enter the amount to be WithDrawn");
				Scanner sc = new Scanner(System.in);
				double amount = sc.nextDouble();
				Account account=new Savings(balance);
	            account.getBalance();
				savings.withdraw(amount);
				sc.close();
			} else if (choice2.equalsIgnoreCase("Deposit")) {
				System.out.println("Enter the amount to be Deposited");
				Scanner sc = new Scanner(System.in);
				double amount = sc.nextDouble();
				Account account=new Savings(balance);
	            account.getBalance();
				savings.deposit(amount);
				savings.showDepositSchemes();
				sc.close();
			}
		} else if (choice.equalsIgnoreCase("Current")) {
			System.out.println("WithDraw/Deposit/GetBalance");
			String choice2 = scanner.next();
			Current current = new Current(balance);
			if (choice2.equalsIgnoreCase("Withdraw")) {
				System.out.println("Enter the amount to be WithDrawn");
				Scanner sc = new Scanner(System.in);
				double amount = sc.nextDouble();
				Account account=new Savings(balance);
	            account.getBalance();
				current.withdraw(amount);
				sc.close();

			} else if (choice2.equalsIgnoreCase("Deposit")) {
				System.out.println("Enter the amount to be Deposited");
				Scanner sc = new Scanner(System.in);
				double amount = sc.nextDouble();
				Account account=new Savings(balance);
	            account.getBalance();
				current.deposit(amount);
				current.transactionsAllowed();
				sc.close();
			}
			scanner.close();
		}
	}
}

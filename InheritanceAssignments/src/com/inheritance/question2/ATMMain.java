package com.inheritance.question2;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {

		System.out.println("Enter the s for savings account and c for current account");
		Scanner sc=new Scanner(System.in);
		String choice=sc.next();
		if(choice.equalsIgnoreCase("s")) {
			Account account=new Savings(500.0);
			System.out.println("Enter the w for withdrawal and d for deposit");
			String choice1=sc.next();
			System.out.println("Enter the amount");
			double amount=sc.nextDouble();
			if(choice1.equalsIgnoreCase("w")) {
				account.withDraw(amount);
			}else if(choice1.equalsIgnoreCase("d")) {
				account.deposit(amount);;
			}
		}else if(choice.equalsIgnoreCase("c")) {
			Account account=new Current(500.0);
			System.out.println("Enter the w for withdrawal and d for deposit");
			String choice1=sc.next();
			System.out.println("Enter the amount");
			double amount=sc.nextDouble();
			if(choice1.equalsIgnoreCase("w")) {
				account.withDraw(amount);
			}else if(choice1.equalsIgnoreCase("d")) {
				account.deposit(amount);;
			}
			
		}
		sc.close();
	}

}

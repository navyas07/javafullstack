package com.training.basic;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		String[] userNames = { "Ram", "Seetha", "Hanuman", "Lakshman" };
		System.out.println("Enter user name");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		boolean user = true;
		for (String name : userNames) {
			if (name.equals(userInput)) {
				user = false;
				break;
			}
		}
		if (user) {
			System.out.println("Invalid username");
		} else {
			System.out.println("You are logged in successfully");
		}
		sc.close();
	}

}

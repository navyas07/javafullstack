package com.training.basic;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {

		String[] existingNames = { "Navya", "Sri", "Priya", "SriPriya" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to register");
		String userName = sc.next();

		boolean isUnique = true;
		for (String name : existingNames) {
			if (name.equals(userName)) {
				isUnique = false;
				break;
			}
		}
		if (isUnique) {
			System.out.println("You are registered");
		} else {
			System.out.println("Name is not unique");
		}
		sc.close();
	}
}

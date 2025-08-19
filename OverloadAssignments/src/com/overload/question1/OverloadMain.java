package com.overload.question1;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        Employee[] employees = new Employee[5];

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter name of employee ");
	            String name = sc.nextLine();

	            System.out.println("Enter designation (Programmer / Manager / Director):");
	            String designation = sc.nextLine();

	            employees[i] = new Employee(name, designation);

			if (designation.equalsIgnoreCase("Programmer")) {
				employees[i].calcBonus(200.0);
			} else if (designation.equalsIgnoreCase("Manager")) {
				employees[i].calcBonus(500.0, "Watch");
			} else if (designation.equalsIgnoreCase("Director")) {
				employees[i].calcBonus(800.0, "Phone", 300.0);
			}
		}

		sc.close();

	}

}

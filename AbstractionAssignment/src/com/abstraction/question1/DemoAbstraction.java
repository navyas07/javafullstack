package com.abstraction.question1;

import java.util.Scanner;

public class DemoAbstraction {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter employee type (1-Manager, 2-TeamLead, 3-Developer): ");
	        int choice = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter Employee Name: ");
	        String name = sc.nextLine();
	        System.out.println("Enter Employee Salary: ");
	        double salary = sc.nextDouble();
	        System.out.println("Enter Employee ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        Employee emp = null;

	        switch (choice) {
	            case 1: // Manager
	                System.out.println("Enter Manager Activity: ");
	                String act = sc.nextLine();
	                emp = new Manager(name, salary, id, act);
	                emp.printDetails();
	                emp.calcBonus(1000);
	                emp.showProjects();
	                emp.showRules();
	                ((Manager) emp).funClub(); // own method
	                break;

	            case 2: // TeamLead
	                System.out.println("TeamLead cannot be created directly. Creating Developer instead.");
	                break;

	            case 3: // Developer
	                System.out.println("Enter number of hobbies: ");
	                int n = sc.nextInt();
	                sc.nextLine();
	                String[] hobbies = new String[n];
	                for (int i = 0; i < n; i++) {
	                    System.out.println("Enter hobby " + (i + 1) + ": ");
	                    hobbies[i] = sc.nextLine();
	                }
	                emp = new Developer(name, salary, id, hobbies);
	                emp.printDetails();
	                emp.calcBonus(500);
	                emp.showProjects();
	                emp.showRules();
	                ((Developer) emp).showHobbies();
	                break;

	            default:
	                System.out.println("Invalid choice!");
	        }

	        sc.close();
	    }
}

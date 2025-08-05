package com.training.arrays;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the values");
		String name=sc.next();
		System.out.println("name "+name);
		int empId=sc.nextInt();
		System.out.println("emp "+empId);
		double salary=sc.nextDouble();
		System.out.println("salary "+salary);

		sc.close();
	}

}

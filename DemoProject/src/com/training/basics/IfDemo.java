package com.training.basics;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		String grade;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the marks to know your grades!");
		double m1 = sc.nextDouble();
		System.out.println("Marks1 :" + m1);
		double m2 = sc.nextDouble();
		System.out.println("Marks2 :" + m2);
		double m3 = sc.nextDouble();
		System.out.println("Marks3 :" + m3);

		double sum;
		double avg;

		sum = m1 + m2 + m3;
		System.out.println("Total Sum :" + sum);

		avg = (m1 + m2 + m3) / 3;
		System.out.println("Average :" + avg);

		if ((avg >= 90) && (avg <= 100)) {
			grade = "A";
		} else if ((avg >= 80) && (avg <= 90)) {
			grade = "B";
		} else if ((avg >= 70) && (avg <= 80)) {
			grade = "C";
		} else if ((avg >= 50) && (avg <= 70)) {
			grade = "D";
		} else {
			grade = "FAIL";
		}

		System.out.println("Grade is " + grade);
		sc.close();
	}
}

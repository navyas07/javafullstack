package com.training.basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int factorial=1;
		if (num == 0) {
			System.out.println("The factorial of the number "+num+" is "+ factorial);
		}else {
			for(int i=num;i>=2;i--) {
				factorial*=i;
			}
			System.out.println("The factorial of the number "+num+" is "+ factorial);
		}
		sc.close();
	}
}

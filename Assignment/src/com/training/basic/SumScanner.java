package com.training.basic;

import java.util.Scanner;

public class SumScanner {

	public static void main(String[] args) {
		int[] array=new int[5];
		Scanner sc =new Scanner(System.in);
			System.out.println("Enter the array of numbers");
			for (int i = 0; i < array.length; i++) {
				array[i]=sc.nextInt();
			}
			int sum=0;
			int average=0;
			for(int i=0;i<array.length;i++) {
				 sum+=array[i];
			}
			average=sum/array.length;
			System.out.println("The sum of all the numbers in the array is "+sum);
			System.out.println("The average of all the numbers in the array is "+average);
		sc.close();
	}
}

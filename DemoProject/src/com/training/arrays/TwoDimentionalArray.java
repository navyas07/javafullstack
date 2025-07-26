package com.training.arrays;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {

		int [][]marks=new int[3][];
		marks[0]=new int[3];
		marks[1]=new int[4];
		marks[2]=new int[2];
		System.out.println(marks.length);

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter values");
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter row values "+i);
			for(int j=0;j<marks[i].length;j++) {
				System.out.println("Enter column values "+j);
				marks[i][j]=sc.nextInt();
			}
		}
		for(int []one:marks) {
			for(int value:one) {
				System.out.print(value+ " ");
			}
			System.out.println();
		}
		sc.close();
	}

}

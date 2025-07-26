package com.training.arrays;

import java.util.Scanner;

public class OneDimentionScanner {

	public static void main(String[] args) {

		int[] nums=new int[4];
		Scanner sc =new Scanner(System.in);
			System.out.println("Enter nums");
			for (int i = 0; i < nums.length; i++) {
				nums[i]=sc.nextInt();
			}
			
			for(int value:nums)
				System.out.println(value);
	}

}

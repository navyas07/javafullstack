package com.training.basic;

public class Sum {

	public static void main(String[] args) {

		int[] array= {10,20,30,40,50};
		int sum=0;
		int average=0;
		for(int i=0;i<array.length;i++) {
			 sum+=array[i];
		}
		average=sum/array.length;
		System.out.println("The sum of all the numbers in the array is "+sum);
		System.out.println("The average of all the numbers in the array is "+average);
	}

}

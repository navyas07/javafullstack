package com.training.basic;

public class SmallSecond {

	public static void main(String[] args) {
		int arr[] = { 40, 60, 2, 41 };
	    int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
		  for (int num : arr) {
	            if (num < smallest) {
	                secondSmallest = smallest;
	                smallest = num;
	            } else if (num > smallest && num < secondSmallest) {
	                secondSmallest = num;
	            }
	            System.out.println("Second smallest number is: " + secondSmallest);
	        }
	}
}

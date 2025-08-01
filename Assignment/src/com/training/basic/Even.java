package com.training.basic;

public class Even {

	public static void main(String[] args) {

		int []evenNumbers= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	    evenNumber(evenNumbers);
		
	}
	static void evenNumber(int[] evenNumbers){
		
		for(int i=0;i<evenNumbers.length;i++) {
			if(evenNumbers[i]%2==0) {
				System.out.println("The even numbers are "+evenNumbers[i]);
			}
		}
	}
}

package com.oops.overload;

public class VarArgsDemo {
	
	public static void main(String[] args) {
		sum();
		sum(2,3);
		sum(120,30,50);
	}
	static void sum(int x,int y) {
		System.out.println(x*y);
	}
	static void sum(int... marks) {
		int sum=0;
		for(int mark:marks) {
			sum+=mark;
		}
		System.out.println("sum "+sum);
	}

}

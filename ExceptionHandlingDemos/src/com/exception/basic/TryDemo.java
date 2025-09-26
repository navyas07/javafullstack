package com.exception.basic;

public class TryDemo {

	public static void main(String[] args) {

		System.out.println("Welcome");
		try {
		String value=args[0];//Array index out of bound
		System.out.println("Value "+value);
		int num=Integer.parseInt(value);// Number format exception
		System.out.println("num "+num);
		int result=100/num; // Arithmetic exception
		System.out.println(result);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("Task complete");
	}

}

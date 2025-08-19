package com.exception.basic;

public class TryDemo {

	public static void main(String[] args) {

		System.out.println("Welcome");
		String value=args[0];//Array index out of bound
		System.out.println("Value "+value);
		int num=Integer.parseInt(value);//
		System.out.println("num "+num);
		int result=100/num;
		System.out.println(result);
		System.out.println("Task complete");
	}

}

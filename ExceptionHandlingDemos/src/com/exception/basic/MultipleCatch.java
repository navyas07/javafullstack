package com.exception.basic;

public class MultipleCatch {

	public static void main(String[] args) {

		System.out.println("Welcome");
		try {
		String value=args[0];//Array index out of bound
		System.out.println("Value "+value);
		int num=Integer.parseInt(value);// Number format exception
		System.out.println("num "+num);
		int result=100/num; // Arithmetic exception
		System.out.println(result);
		int[] marks=null;  
		System.out.println(marks[0]);
		}catch(ArithmeticException e) {
			System.out.println("Dont enter 0");
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("Dont enter string value");
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter value");
			System.out.println(e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("runtime exception");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("other exception");
			System.out.println(e.getMessage());
		}
		System.out.println("Task complete");
	}

}

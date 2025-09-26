package com.exception.exercise;

public class A {

	public static void main(String[] args) {
		System.out.println("Started");
		try {
			B.method1();
		} catch (Exception e) {
			System.out.println("Technical error");
		}finally {
			System.out.println("Close");
		}
		System.out.println("Done");
	}

	class B {
		static void method1() throws Exception {
			System.out.println("Hello");
			C.method2();
			System.out.println("In class B");
		}
	}

	class C {
		static void method2() throws Exception {
			System.out.println("Welcome");
			try {
				D.method3();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				throw e;
			}
			System.out.println("In class C");
		}
	}

	class D {
		static void method3() throws Exception {
			System.out.println("In class D");
			throw new Exception("Invalid username and password");

//		int x=10/0;
		}
	}
}

package com.oops.st;

public class StaticDemo {

	static int x=100;
	static {
		System.out.println("demo block1");
	}
	static {
		System.out.println("demo block2");
	}
	static void sayHello() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		Trail.greet();
		System.out.println("Value "+x);
		System.out.println("Sum "+(Trail.x+Trail.y));
	}

}

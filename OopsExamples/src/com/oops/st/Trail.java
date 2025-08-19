package com.oops.st;

public class Trail {
	static int x=10;
	static int y=20;
	static {
		y=30;
		System.out.println("block1");
	}
	static {
		System.out.println("block2");
	}
	static void greet() {
		System.out.println("greet");
	}
}

package com.training.question1;


public class ShapeMain {

	public static void main(String[] args) {

		IShape rectangle=(x,y)->System.out.println("Area of rectangle =" +(x*y));
		rectangle.area(15,20);
		IShape triangle=(x,y)->System.out.println("Area of triangle =" +(0.5*x*y));
		triangle.area(15,20);
		IShape square=(x,y)->System.out.println("Area of square =" +(x*x));
		square.area(15,15);
	}
}

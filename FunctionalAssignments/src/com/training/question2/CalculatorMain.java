package com.training.question2;

public class CalculatorMain {

	public static void main(String[] args) {

		ICalculator sum=(x,y)->System.out.println("Sum is "+(x+y));
		sum.calculate(5, 10);
		
		ICalculator product=(x,y)->System.out.println("product is "+(x*y));
		product.calculate(5, 10);
		
		ICalculator cube=(x,y)->System.out.println("Cube is "+(x*x*x));
		cube.calculate(5, 10);
	}
}

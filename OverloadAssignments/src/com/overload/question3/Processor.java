package com.overload.question3;

public class Processor {
	 void calculate(double x){
		 System.out.println("The square root of "+x+" is "+(Math.sqrt(x)));
	 }
	 void calculate(int x, int y){
		 System.out.println("The product of "+x+" and "+y+" is "+(x*y));
	 } 
	 void calculate(double x, double y){
		 System.out.println("The difference of "+x+" and "+y+"y is "+(x-y));
	 } 
	 void calculate(double x,int y) {
		 System.out.println("The "+x+" power "+y+" is "+(Math.pow(x, y)));
	 }
	 void calculate(int x) {
		 System.out.println("The "+x+" square is "+(Math.pow(x, 2)));
	 }
}

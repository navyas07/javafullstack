package com.overload.question3;

public class ProcessorMain {

	public static void main(String[] args) {

		Processor process=new Processor();
		process.calculate(5);
		process.calculate(6.0);
		process.calculate(2, 4);
		process.calculate(4.0, 3);
		process.calculate(5,2.0);
	}

}

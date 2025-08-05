package com.oops.override;

public class Bike extends Vehicle {

	public Bike(String model, String brand) {
		super(model, brand);
		// TODO Auto-generated constructor stub
	}
	@Override
	void getMileage() {
		System.out.println("Okay mileage");
	}
	void printType() {
		System.out.println("Sports bike");
	}

}

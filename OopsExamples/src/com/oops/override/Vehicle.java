package com.oops.override;

public class Vehicle {
	String model;
	String brand;
	
	public Vehicle(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}

	void getMileage() {
		System.out.println("good milage");
	}
}

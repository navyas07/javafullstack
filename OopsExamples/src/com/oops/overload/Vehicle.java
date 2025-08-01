package com.oops.overload;

public class Vehicle {

	String model;
	String brand;
	double price;
	public Vehicle() {
		super();
	}
	
	public Vehicle(String model) {
		super();
		this.model = model;
	}

	public Vehicle(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}

	public Vehicle(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
	
}

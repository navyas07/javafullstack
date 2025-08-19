package com.basics.question5;

public class Mobile {

	String model;
	String brand;
	String colour;
	public Mobile(String model, String brand, String colour) {
		super();
		this.model = model;
		this.brand = brand;
		this.colour = colour;
	}
	
	void getDetails() {
		System.out.println("The model is "+model);
		System.out.println("The brand is "+brand);
		System.out.println("The colour is "+colour);
		System.out.println();
	}
}

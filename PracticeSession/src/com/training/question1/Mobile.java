package com.training.question1;

public class Mobile {
	String model;
	double price;
	String brand;
	public Mobile(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
	
	void getDetails() {
		System.out.println("Model "+model);
		System.out.println("Price "+price);
		System.out.println("Brand "+brand);
	}
	String[] showFeatures(){
	String[]features= {"Camera quality is good","Very affordable"};
	System.out.println(features[0]);
	System.out.println(features[1]);
	return features;
	}
}

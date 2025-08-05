package com.oops.override;

public class Car extends Vehicle {

	public Car(String model, String brand) {
		super(model, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMileage() {
		super.getMileage();
		// TODO Auto-generated method stub
		System.out.println("Excellent Mileage for car");
	}

	void showAcc() {
		System.out.println("Seat cover");
	}

}

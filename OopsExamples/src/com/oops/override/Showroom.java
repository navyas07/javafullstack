package com.oops.override;

public class Showroom {

	public static void main(String[] args) {
		// super class ref=sub class object
		Vehicle vehicle = new Car("Honda","City");
		vehicle.getMileage();//calls method of car

		vehicle=new Bike("Pulsar","N20");
		vehicle.getMileage();//calls method of bike

		Bike bike1=(Bike) vehicle;
		bike1.printType();
		
//		Car car = (Car) vehicle;
//		car.showAcc(); 
		
		
	}

}

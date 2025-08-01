package com.training.question1;

public class MobileMain {

	public static void main(String[] args) {

		Mobile mobile=new Mobile("S21",18000,"Samsung");
		mobile.getDetails();
	    mobile.showFeatures();
		Mobile mobile1=new Mobile("A25",16000,"Redmi");
		mobile1.getDetails();
	    mobile1.showFeatures();
		
	}

}

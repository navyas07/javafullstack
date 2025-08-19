package com.basics.question5;

public class MobileMain {

	public static void main(String[] args) {

		Mobile mobile1=new Mobile("A21","Samsung","Black");
		Mobile mobile2=new Mobile("A15","Redmi","Blue");
		Mobile mobile3=new Mobile("A26","Samsung","Green");
		Mobile mobile4=new Mobile("S2","Asus","Gold");
		Mobile mobile5=new Mobile("S1","Nokia","Silver");
		
		Mobile [] mobileArray = new Mobile[5]; 
		mobileArray[0]=mobile1;  
		mobileArray[1]=mobile2; 
		mobileArray[2]=mobile3; 
		mobileArray[3]=mobile4; 
		mobileArray[4]=mobile5; 

		
		 System.out.println("All Mobiles:");
	        for (Mobile mob : mobileArray) {
	            mob.getDetails();
	        }

	        // Printing only Samsung mobiles
	        System.out.println("\nSamsung Mobiles:");
	        for (Mobile mob : mobileArray) {
	            if (mob.brand.equalsIgnoreCase("Samsung")) {
	                mob.getDetails();
	            }
	        }
	}

}

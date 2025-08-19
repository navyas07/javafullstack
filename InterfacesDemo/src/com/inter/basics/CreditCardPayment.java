package com.inter.basics;

public class CreditCardPayment extends CardPayment {

	@Override
	public String showPaymentMode() {
		System.out.println("Credit card");
		return "Credit card";
	}
	void showOffers() {
		System.out.println("Show discounts above 1000");
	}
	

}

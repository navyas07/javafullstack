package com.inter.basics;

public class DebitCardPayment extends CardPayment {

	@Override
	public String showPaymentMode()
	{
		System.out.println("Debit card");
		return "Debit card";
	}

}

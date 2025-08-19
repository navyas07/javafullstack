package com.inter.basics;

public class Client {

	public static void main(String[] args) {

		IPayment payment=new NetBanking();
		payment.showPaymentMode();
		System.out.println(IPayment.CATEGORY);
		
		payment=new CreditCardPayment();
		payment.showPaymentMode();
		
		CreditCardPayment credit=(CreditCardPayment) payment;
		credit.showOffers();
		
		payment=new DebitCardPayment();
		payment.showPaymentMode();
	}

}

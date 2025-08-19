package com.inter.basics;

public class NetBanking implements IPayment{

	@Override
	public String showPaymentMode() {
		System.out.println("NetBanking");
		return "Using bank accounts";
	}
	
	

}

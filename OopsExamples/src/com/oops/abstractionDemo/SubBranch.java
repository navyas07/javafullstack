package com.oops.abstractionDemo;

public class SubBranch extends Branch2 {

	@Override
	public void carLoan() {
		System.out.println("Car loan of sub branch");
	}
	//own method
	void depositTypes() {
		System.out.println("SIP, mutual fund, RD");
	}
}

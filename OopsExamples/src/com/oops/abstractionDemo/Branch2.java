package com.oops.abstractionDemo;

public abstract class Branch2 extends Bank {

	@Override
	public void homeLoan() {
		System.out.println("Home loan branch2");
	}

	@Override
	public void educationLoan() {
		System.out.println("Education loan branch2");
	}
	//own method
	void loanTypes() {
		System.out.println("For agriculture,small scale");
	}
}

package com.exception.userDefined;

public class BankAccount {
	 double balance;
		public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
		void withdraw(int amount) throws ExceedingLimitsException, InsufficientBalanceException {
			System.out.println("In bank");
			if(balance-amount<=2000)
				throw new InsufficientBalanceException("Insufficient balance");
			if(amount>=5000) 
				throw new ExceedingLimitsException("amount should be less than or equal to 2000");
			balance-=amount;
			System.out.println("Balance "+balance);
		System.out.println("Task completed");
}
}
   
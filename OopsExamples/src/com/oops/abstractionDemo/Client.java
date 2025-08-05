package com.oops.abstractionDemo;

public class Client {

	public static void main(String[] args) {
        //using bank ref call all methods of bank
		Bank bank = new Branch1();
		bank.carLoan();
		bank.homeLoan();
		bank.educationLoan();
		bank.adminDetails();
		System.out.println();
		// call own method of Branch1
		Branch1 branch1 = (Branch1) bank;
		branch1.payDetails();
		System.out.println();
		//for
        bank=new SubBranch();
        bank.carLoan();//sub branch
        bank.homeLoan();//branch2
        bank.educationLoan();//branch2
        bank.adminDetails();//bank
        System.out.println();
        
        //super class ref = sub class object
        Branch2 branch2=(Branch2) bank;
        branch2.loanTypes();//branch2
        branch2.adminDetails();//bank
        
        SubBranch sub=(SubBranch) branch2;
        sub.depositTypes();//sub branch
        sub.loanTypes();//branch2
        sub.adminDetails();//bank
	}

}

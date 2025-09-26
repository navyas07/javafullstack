package com.voterapp.client;

import java.util.Scanner;

import com.voterapp.exception.NotEligibleException;
import com.voterapp.service.ElectionBoothServiceImpl;
import com.voterapp.service.IElectionBoothService;

public class Voter {

	public static void main(String[] args) {
		IElectionBoothService service=new ElectionBoothServiceImpl();

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the age");
		int age=scanner.nextInt();
		
		System.out.println("Please enter the locality");
		String locality=scanner.next();
		
		System.out.println("Please enter the voter ID");
		int voterID=scanner.nextInt();
		try {
			if(service.checkEligibility(age, locality, voterID)) {
				System.out.println("Eligible to vote");
			}
		} catch (NotEligibleException e) {
			e.printStackTrace();
			e.getMessage();
		}finally {
			scanner.close();
		}
	
	}
}

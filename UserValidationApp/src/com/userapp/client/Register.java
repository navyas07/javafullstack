package com.userapp.client;

import java.util.Scanner;

import com.userapp.exceptions.TooLongPasswordException;
import com.userapp.exceptions.TooShortPasswordException;
import com.userapp.exceptions.UserNameAlreadyExistsException;
import com.userapp.service.ValidationServiceImpl;

public class Register {

	public static void main(String[] args) {
		ValidationServiceImpl service = new ValidationServiceImpl();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the user name");
		String userNameString = scanner.next();
		System.out.println("Enter the password");
		String password = scanner.next();
	try {
		if(service.validateUserName(userNameString)&& service.validatePassword(password))
			System.out.println("Registered successfully");
	} catch (UserNameAlreadyExistsException e) {
		e.getMessage();
		e.printStackTrace();
	} catch (TooShortPasswordException e) {
		e.getMessage();
		e.printStackTrace();
	} catch (TooLongPasswordException e) {
		e.getMessage();
		e.printStackTrace();
	}
		finally {
			scanner.close();
		}
	}

}

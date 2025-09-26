package com.userapp.service;

import com.userapp.exceptions.TooLongPasswordException;
import com.userapp.exceptions.TooShortPasswordException;
import com.userapp.exceptions.UserNameAlreadyExistsException;

public class ValidationServiceImpl implements IValidationService {

	public ValidationServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validateUserName(String userName) throws UserNameAlreadyExistsException {
        String[] userNames= {"Jacob","Kevin","Raju"};
        for(String username:userNames) {
        	if(userName.equalsIgnoreCase(username)) throw new UserNameAlreadyExistsException("Username already exists");
        }
		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooShortPasswordException, TooLongPasswordException {

		if(password.length()<8) throw new TooShortPasswordException("Password is too short. Minimum of 8 characters are reequired");
		else if (password.length()>12) throw new TooLongPasswordException("Password is too long. Maximum of 12 characters are allowed");
		return true;
	}
}

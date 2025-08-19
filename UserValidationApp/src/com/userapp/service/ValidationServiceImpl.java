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
		return false;
	}

	@Override
	public boolean validatePassword(String password) throws TooShortPasswordException, TooLongPasswordException {
		// TODO Auto-generated method stub
		return false;
	}

}

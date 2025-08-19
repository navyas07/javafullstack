package com.userapp.service;

import com.userapp.exceptions.TooLongPasswordException;
import com.userapp.exceptions.TooShortPasswordException;
import com.userapp.exceptions.UserNameAlreadyExistsException;

public interface IValidationService {
	
	boolean validateUserName(String userName) throws UserNameAlreadyExistsException;
	boolean validatePassword(String password) throws TooShortPasswordException,TooLongPasswordException;
	

}

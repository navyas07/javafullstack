package com.voterapp.exception;

@SuppressWarnings("serial")
public class UnderAgeException extends NotEligibleException {

	public UnderAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(String message) {
		super(message);
	}

}

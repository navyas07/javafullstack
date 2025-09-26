package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {

	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
      if(checkAge(age)&&checkLocality(locality)&&checkVoterId(vid)) {
    	  return true;
      }
		  return false;

	}

	private boolean checkAge(int age)throws UnderAgeException{
		if(age<18) {
	    throw new UnderAgeException("Minimum age to vote is 18");
		}
		return true;
}
	private boolean checkLocality(String locality )throws LocalityNotFoundException{ 
	 String[] localities =new String []{"JPNagar","ABCNagar","whitefield"}; 
	 for(String locality1:localities) {
		if(locality.equalsIgnoreCase(locality1)) {
			 return true; 
		}
	 }
			throw new LocalityNotFoundException("Locality not found");
	} 
	private boolean checkVoterId(int voterId) throws InvalidVoterIDException { 
		if(voterId<1000 || voterId>9999) throw new InvalidVoterIDException("Invalid voterID");
		else 
			return true;
		
	}
}

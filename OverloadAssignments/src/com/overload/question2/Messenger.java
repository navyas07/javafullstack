package com.overload.question2;

public class Messenger {

	void sendMail(String message){
	
		System.out.println(message);
	}
	void sendMail(String toUsername, String message){
		System.out.println(toUsername+" "+message);
	} 
		 
	void sendMail(String toUsername, String message,String subject){
		System.out.println(toUsername+" "+message+" "+subject);
	} 
}

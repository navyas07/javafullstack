package com.overload.question2;

public class MessengerMain {

	public static void main(String[] args) {

		Messenger message=new Messenger();
		message.sendMail("Hello");
		message.sendMail("Navya","Hello");
		message.sendMail("Navya","Hello","Good morning");
	}

}

package com.basics.question1;

public class BookMain {

	public static void main(String[] args) {

		Book book1=new Book("The Lion King","Ram",200.0,"Story book");
		book1.getDetails();
		book1.checkBookType();
		
		Book book2=new Book("The Ramayana","Ganesh",900.0,"Mythology");
		book2.getDetails();
		book2.checkBookType();
	}

}

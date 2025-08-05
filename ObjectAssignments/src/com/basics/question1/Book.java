package com.basics.question1;

public class Book {

	String title;
	String author;
	Double price;
	String category;
//	public Book(String title) {
//		super();
//		this.title = title;
//	}
//	public Book(String title, String author) {
//		super();
//		this.title = title;
//		this.author = author;
//	}
//	public Book(String title, String author, Double price) {
//		super();
//		this.title = title;
//		this.author = author;
//		this.price = price;
//	}
	public Book(String title, String author, Double price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	
	void getDetails() {
		System.out.println("Title of the book is "+title);
		System.out.println("Author of the book is "+author);
		System.out.println("Price of the book is "+price);
		System.out.println("Category of the book is "+category);
	}
	void checkBookType() {
		if(price>500) {
			System.out.println("Premium book");
		}
		else {
			System.out.println("Standard book");
		}
	}
}

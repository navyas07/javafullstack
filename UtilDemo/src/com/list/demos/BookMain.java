package com.list.demos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class BookMain {

	public static void main(String[] args) {

		Book book1 = new Book("Book1", "Author1", 10.0);
		Book book2 = new Book("Book2", "Author2", 20.0);
		Book book3 = new Book("Book2", "Author2", 30.0);
		Book book4 = new Book("Book2", "Author2", 40.0);
		Book book5 = new Book("Book2", "Author2", 40.0);

		ArrayList list = new ArrayList();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		System.out.println(list);
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println();
		Iterator i=list.iterator();
		while (i.hasNext()) {
			Object obj = i.next();
			System.out.println(obj);
		}
		System.out.println();

		HashSet<Book> set=new HashSet<>();
        set.add(book4);
        set.add(book5);
        System.out.println(set);
	}

}

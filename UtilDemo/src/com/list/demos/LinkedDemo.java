package com.list.demos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		System.out.println(list.size());
		list.add("Ram");
		list.add("Tom");
		System.out.println(list);
		list.add(1, "poppy");
		System.out.println(list);

		list.add("Tom");
		list.set(0, "Kevin");
		System.out.println(list);
		System.out.println(list.size());

		for (String s : list) {
			System.out.println(s.toUpperCase());
		}
		Iterator<String> i=list.iterator();
		while (i.hasNext()) {
			String str = i.next();
			System.out.println(str);
		}
		ListIterator<String> iterator=list.listIterator(list.size());
		while (iterator.hasPrevious()) {
			String str = iterator.previous();
			System.out.println(str);
		}
	}
}


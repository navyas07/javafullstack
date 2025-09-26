package com.set.demos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		System.out.println(set.size());
		set.add("Kevin");
		set.add("Ram");
		set.add("Tom");
		set.add("null");
		set.add("Kevin");
		set.add("null");
		set.add(null);
		System.out.println(set);
		System.out.println();
		
		LinkedHashSet<String> set1=new LinkedHashSet<>();
		System.out.println(set1.size());
		set1.add("Kevin");
		set1.add("Ram");
		set1.add("Tom");
		set1.add("null");
		set1.add("Kevin");
		set1.add("null");
		set1.add(null);
		System.out.println(set1);
		System.out.println();
		
		TreeSet<String> set2=new TreeSet<>();
		System.out.println(set2.size());
		set2.add("Kevin");
		set2.add("Ram");
		set2.add("Tom");
		set2.add("null");
		set2.add("Kevin");
		set2.add("null");
//		set2.add(null);
		System.out.println(set2);
	}
}

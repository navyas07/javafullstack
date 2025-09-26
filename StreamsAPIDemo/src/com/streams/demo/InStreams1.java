package com.streams.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class InStreams1 {

	public static void main(String[] args) {
		
//		Consumer<String> pred=(str)->System.out.println(str);
		List<String> courses=
				Arrays.asList("Java","JSP","CSS","HTML","Spring","JavaScript","Microservices");
	
		//Convert to a stream
//		Stream<String> st=courses.stream();
//		System.out.println(st);
		
		courses.stream()
		        .filter(str->str.length()>3)
		        .forEach(str->System.out.println(str.toUpperCase()));
//		        .forEach(System.out::println);
		System.out.println();
	List<String> ncourses=	courses.stream()
		.filter(str->str.length()>3)
		.sorted((s1,s2)->s2.compareTo(s1))
//		.limit(3)
		.skip(3)
		.distinct()
//		.toList();
		.collect(Collectors.toList());
	ncourses.forEach(System.out::println);
	
	System.out.println();
	
	courses.stream()
	.filter(str->str.startsWith("J"))
	.map(str->str.length())
	.forEach(System.out::println);
	}
}

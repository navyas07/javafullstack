package com.streams.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {

	public static void main(String[] args) {

		List<String> courses=
				Arrays.asList("Java","JSP","CSS","HTML","Spring","JavaScript","Microservices");
	
		courses.stream().forEach(System.out::println);	
		
	    Integer[] num=new Integer[] {10,12,14,16,18};
	    Stream.of(num).forEach(System.out::println);
	
	    int [] num1= {10,11,12,13,14,15};
	    Arrays.stream(num1).forEach(System.out::println);
	
	Stream.generate(()->10).limit(3).forEach(System.out::println);
	}

}

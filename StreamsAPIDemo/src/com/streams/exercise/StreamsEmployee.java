package com.streams.exercise;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamsEmployee {

	public static void main(String[] args) {

List<Employee> employees = 
				Arrays.asList(
					new Employee("Raju","Ooty",2000,1),
					new Employee("Jeni","Bengaluru",24000,2),
					new Employee("Kevin","Chennai",12000,3),
					new Employee("Akash","Ooty",8000,4),
					new Employee("Tina","Mysore",15000,5),
					new Employee("Sri","Mysore",8400,6));

employees.stream()
.filter(emp->emp.getCity().equals("Mysore"))
.forEach(System.out::println);


	}
}

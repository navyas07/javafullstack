package com.training.question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDemo {

	public static void main(String[] args) {

		Course c1=new Course("Spring","Backend");
		Course c2=new Course("HTML","Front");
		Course c3=new Course("Policies","Finance");
		Course c4=new Course("AI","Testing");

		List<Employee> emp1=new ArrayList<Employee>();
		emp1.add(new Employee("Navya", "IT", "Bengaluru"));
		
		List<Employee> emp2=new ArrayList<Employee>();
		emp2.add(new Employee("Sri", "HR", "Chennai"));
		
		List<Employee> emp3=new ArrayList<Employee>();
		emp3.add(new Employee("Priya", "Finance", "Mysore"));
		
		List<Employee> emp4=null;		
		
		Map<Course, List<Employee>> eMap= new HashMap<>();
		eMap.put(c1, emp1);
		eMap.put(c2, emp2);
		eMap.put(c3, emp3);
        eMap.put(c4, emp4);
        
        for(Map.Entry<Course, List<Employee>> entry: eMap.entrySet()) {
        	System.out.println(entry);
        }
		
	}

}

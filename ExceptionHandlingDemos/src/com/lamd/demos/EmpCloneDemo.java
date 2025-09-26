package com.lamd.demos;

public class EmpCloneDemo {

	public static void main(String[] args) {

		Employee employee1=new Employee("Ram",1,"Bengaluru");
		try {
			Employee clonedemployee=(Employee)employee1.clone();
System.out.println(clonedemployee);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

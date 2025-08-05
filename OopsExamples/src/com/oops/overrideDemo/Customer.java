package com.oops.overrideDemo;

public class Customer {

	public static void main(String[] args) {

		Project project=new GroupOne("Development", "6months", "Priya");
		project.projectAssigned();//group1
		System.out.println();
		
		GroupOne group1=(GroupOne) project;
		group1.showTools();//group1
		group1.projectAssigned();//group1
		System.out.println();
		
		project=new GroupTwo("Shristi","4months","Sri");
		project.projectAssigned();//group2
		System.out.println();
		
		GroupTwo group2=(GroupTwo) project;
		group2.coursesAssigned("MernStack","MeanStack");
		group2.projectAssigned();//group2
		System.out.println();//group2
		
		Project project1=new Project("JavaFullStack","5months" , "SriPriya");
		project1.projectAssigned();//project
		
	}

}

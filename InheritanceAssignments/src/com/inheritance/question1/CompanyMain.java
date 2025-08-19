package com.inheritance.question1;

public class CompanyMain {

	public static void main(String[] args) {

		Project project=new TeamOne();
		project.doTask();
		
		TeamOne teamOne=(TeamOne)project;
		teamOne.softwaresUser("eclipse","Jenkins","maven");
	
		Project project1=new TeamTwo();
		project1.doTask();
		
		TeamTwo teamTwo=(TeamTwo)project1;
		teamTwo.getTechStack();
		
		Project project2=new Project();
		project2.doTask();	
	}
}

package com.inheritance.question1;

public class TeamTwo extends Project{

	void doTask() {
		System.out.println("Project implementation using Python");
	}
	String[] getTechStack(){
		
		String[] techStack= {"ML","AI"};
		for(String stack: techStack) {
		System.out.println(stack);
		}
		return techStack;
	}
}

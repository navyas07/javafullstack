package com.inheritance.question1;

public class TeamOne extends Project{

	void doTask() {
		System.out.println("Project implemented using java");
	}
	void softwaresUser(String... tools) {
		System.out.println("Softwares used: ");
		for(String tool: tools) {
			System.out.println(tool);
		}
	}
}

package com.inter.def;

public class TeamTwo implements IProject {

	@Override
	public void doTask() {
		System.out.println("Project done using Java full stack");
	}

	//default methods can be overridden
	@Override
	public String[] techStacks() {
		return new String[] {"Spring","Java","Junit"};
	}

}

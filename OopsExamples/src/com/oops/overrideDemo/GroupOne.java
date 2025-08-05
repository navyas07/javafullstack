package com.oops.overrideDemo;

public class GroupOne extends Project {

	public GroupOne(String clientName, String duration, String tLName) {
		super(clientName, duration, tLName);
	}

	@Override
	void projectAssigned() {
		System.out.println("GroupOne project");
	}

	String[] showTools() {
		String[] array = new String[2];
		array[0] = "ML";
		array[1] = "LMM";
		System.out.println(array[0]);
		System.out.println(array[1]);
		return array;

	}

}

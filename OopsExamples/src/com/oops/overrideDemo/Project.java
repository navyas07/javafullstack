package com.oops.overrideDemo;

public class Project {

	String clientName;
	String duration;
	String TLName;
	
	
	public Project(String clientName, String duration, String tLName) {
		super();
		this.clientName = clientName;
		this.duration = duration;
		TLName = tLName;
	}


	void projectAssigned() {
		System.out.println("AI project");
		System.out.println(clientName);		
		System.out.println(duration);
		System.out.println(TLName);

	}
}

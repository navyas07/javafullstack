package com.inter.def;

public class Client {

	public static void main(String[] args) {

		IProject project=new TeamOne();
		project.doTask();
		String[] techStack=project.techStacks();
		for(String tech:techStack) {
			System.out.println(tech);
		}
		project=new TeamTwo();
		project.doTask();
		techStack=project.techStacks();
		for(String tech:techStack) {
			System.out.println(tech);
		}
	}
}

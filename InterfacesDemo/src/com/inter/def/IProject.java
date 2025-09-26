package com.inter.def;

public interface IProject {

	void doTask();

	// to add new functionality to existing interface
	default String[] techStacks() {
		return new String[] { "jenkins", "git" };

	}
}

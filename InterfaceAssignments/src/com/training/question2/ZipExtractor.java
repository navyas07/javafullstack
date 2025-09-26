package com.training.question2;

public class ZipExtractor implements IExtractor {

	@Override
	public void extractFiles(String fileName) {

		System.out.println("Extracting from zip =>files as .txt,as jpeg, as .doc files");
	}

}

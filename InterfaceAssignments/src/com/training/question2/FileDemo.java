package com.training.question2;

import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("z for zip, j for jar, r for rar");
		String choiceString =scanner.next();
		if(choiceString.equalsIgnoreCase("z")){
			IExtractor extractor=new ZipExtractor();
			extractor.extractFiles("examples.zip");
		}else if(choiceString.equalsIgnoreCase("j")) {
			IExtractor extractor=new JarExtractor();
			extractor.extractFiles("example.jar");
		}else if(choiceString.equalsIgnoreCase("r")) {
			IExtractor extractor=new RarExtractor();
			extractor.extractFiles("exampl.rar");
		}
		scanner.close();
	}

}

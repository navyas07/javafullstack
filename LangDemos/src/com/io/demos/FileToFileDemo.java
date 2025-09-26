package com.io.demos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileToFileDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		System.out.println("Reading");

		try (FileReader reader = new FileReader("demo.txt"); 
			FileWriter filewriter = new FileWriter("demo1.txt");) {
			int val = 0;
			do {
				val = reader.read();
				filewriter.write(val);

			} while (val != -1);
		}
	}

}

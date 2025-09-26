package com.io.demos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialDemo {

	public static void main(String[] args) {
System.out.println("DeSerializing");
//		Student student=new Student("Ram",10,"ECE");
		//create an object of file output stream
		try(FileInputStream fs=new FileInputStream("student.ser");
				ObjectInputStream os=new ObjectInputStream(fs);)
		{
			Student student=(Student)os.readObject();
			System.out.println(student);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package com.shrishti.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreatePrepDemo {
	public static void main(String[] args) {
		// create a connection object
		String url = "jdbc:mysql://localhost:3306/javaFullStack";
		String username = "root";
		String password = "password";
		String query = """
				create table student(student_name varchar(20),
				student_id int primary key,department varchar(20))
				""";
		//create connection object
		try (Connection connection = DriverManager.getConnection(url, username, password);
				//execute the query
				PreparedStatement statement = connection.prepareStatement(query);){
				boolean isCreated=statement.execute();
				System.out.println("Table created "+!isCreated);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

package com.shrishti.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDemo {
	public static void main(String[] args) {
		// create a connection object
		String url = "jdbc:mysql://localhost:3306/javaFullStack";
		String username = "root";
		String password = "password";
		String query = """
				create table employee(name varchar(20),
				employee_id int,department varchar(20),primary key(employee_id))
				""";
		//create connection object
		try (Connection connection = DriverManager.getConnection(url, username, password);
				//execute the query
				Statement statement = connection.createStatement();){
				boolean isInserted=statement.execute(query);
				System.out.println("Table created "+!isInserted);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

package com.shrishti.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {
	public static void main(String[] args) {
		// create a connection object
		String url = "jdbc:mysql://localhost:3306/javaFullStack";
		String username = "root";
		String password = "password";
		String query = """
				insert into employee values(?,?,?)
				""";
		//create connection object
		try (Connection connection = DriverManager.getConnection(url, username, password);
				//execute the query
				PreparedStatement statement = connection.prepareStatement(query);){

			statement.setString(1, "Hari");
			statement.setInt(2, 102);
			statement.setString(3, "Tech analyst");
			boolean isCreated=statement.execute();
			System.out.println("Value inserted "+!isCreated);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

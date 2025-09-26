package com.shrishti.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
	public static void main(String[] args) {
		// create a connection object
		String url = "jdbc:mysql://localhost:3306/javaFullStack";
		String username = "root";
		String password = "password";
		String query = """
				update employee set department=? where employee_id=?
				""";
		// create connection object
		try (Connection connection = DriverManager.getConnection(url, username, password);
				// execute the query
				PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setString(1, "Manger");
			statement.setInt(2, 100);
			boolean isCreated = statement.execute();
			System.out.println("Value updated " + !isCreated);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

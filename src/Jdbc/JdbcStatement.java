package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcStatement {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/self_learning";
		String userName = "root";
		String password = "Anand@0218";

		try {

			// Establish Connection
			Connection conn = DriverManager.getConnection(url, userName, password);

			// Create statement
			Statement stmt = conn.createStatement();

			// Execute query
			ResultSet rs = stmt.executeQuery("Select dept_id,dept_name from department");

			// Result Process
			while (rs.next()) {
				System.out.println(" Department id: " + rs.getInt("dept_id") + " Department Name : " + rs.getString("dept_name"));
			}

			// Close resources
			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

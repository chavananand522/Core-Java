package Jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcCallableStatement {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/self_learning";
		String user = "root";
		String password = "Anand@0218";

		try {

//		Create Connection
			Connection conn = DriverManager.getConnection(url, user, password);

//		Call stored procedure
			CallableStatement stmt = conn.prepareCall("{call getDepartment(?)}");

//		Set input parameter
			stmt.setInt(1, 2);

//		procedure execute 
			ResultSet rs = stmt.executeQuery();

//		Result process
			while (rs.next()) {
				System.out.println(rs.getInt("dept_id"));
			    System.out.println(rs.getString("dept_name"));
			    System.out.println(rs.getString("location"));
			}

//		Close resources
			conn.close();
			stmt.close();
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

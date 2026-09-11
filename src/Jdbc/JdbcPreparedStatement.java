package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JdbcPreparedStatement {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/self_learning";
		String user = "root";
		String password = "Anand@0218";

		try {

//		    Create Connection 
			Connection conn = DriverManager.getConnection(url, user, password);

//			Prepared Statement
			PreparedStatement stmt = conn.prepareStatement("Select * from department where dept_id = ?");
			
//			Set parameter
			stmt.setInt(1,2);
			
//			Execute Query
			ResultSet rs =stmt.executeQuery();
			
//			Process Result
			while(rs.next()) {
				System.out.println("Department ID : " + rs.getInt("dept_id"));
                System.out.println("Department Name : " + rs.getString("dept_name"));
                System.out.println("Location : " + rs.getString("location"));
			}
			
			rs.close();
			stmt.close();
			conn.close();
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

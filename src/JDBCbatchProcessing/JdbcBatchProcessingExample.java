package JDBCbatchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcBatchProcessingExample {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/self_learning";
		String user = "root";
		String password = "Anand@0218";
		try {

			Connection conn = DriverManager.getConnection(url, user, password);

			String sql = "Insert into department(dept_id,dept_name,location) Values(?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);

//		First Record
			st.setInt(1, 10); 							//Sets the 1st parameter (?) to 22. 	dept_id = 22
			st.setString(2, "Komal");					//Sets the 2nd parameter (?) to "Rahul".  dept_name = Rahul
			st.setString(3, "Pune");
			st.addBatch();								

//		Second Record
			st.setInt(1, 11);
			st.setString(2, "Nitin");
			st.setString(3, "Beed");
			st.addBatch();

//		Third Record
			st.setInt(1, 12);
			st.setString(2, "Anushka");
			st.setString(3, "Wakad");
			st.addBatch();

//		Execute all records together
			int result[] = st.executeBatch();

			System.out.println("Rows Inserted Sucessfully "+result.length);

			st.clearBatch();
			st.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
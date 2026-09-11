package CharacterStream;

import java.io.FileWriter;

public class DataWriter {
	public static void main(String[] args) {
	
		try {
			
			FileWriter fw =new FileWriter("student.txt");
			
			fw.write("Hello java");
			fw.write("\nWelcome to Java");
			
			fw.close();
			
			System.out.println("Data Written Successfully");
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}

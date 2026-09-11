package ByteStream;

import java.io.FileOutputStream;

public class WriteData {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fis= new FileOutputStream("data.txt");
			String msg= "Hello Java";
			
			fis.write(msg.getBytes());
			fis.close();
			
			System.out.println("Data Written Successfully !!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

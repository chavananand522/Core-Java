package ByteStream;

import java.io.FileInputStream;

public class ReadData {

	public static void main(String[] args) {

		try {
		
			FileInputStream fis = new FileInputStream("data.txt");
			int ch;

			while ((ch = fis.read()) != -1) {  //fis.read() reads one byte from the file.
				System.out.print((char) ch);    //When the end of the file is reached, read() returns -1.
			}
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

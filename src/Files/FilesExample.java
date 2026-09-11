package Files;

import java.io.File;
import java.io.IOException;

public class FilesExample {

	public static void main(String[] args) {

		try {

			// Create a File object
			File file = new File("student.txt");
			
			//Create a new file 
			if(file.createNewFile()) {
				System.out.println("File Created:"+file.getName());
			}else {
				System.out.println("File already exists.");
			}
			
			//Get file information
			System.out.println("File Name:"+file.getName());
			System.out.println("File Path:"+file.getPath());
			System.out.println("File Size:"+file.length());
			System.out.println("Can Read:"+file.canRead());
			System.out.println("Can Write"+file.canWrite());
			
			//Rename the file
			File newFile= new File("student_data.txt");
			if(file.renameTo(newFile)) {
				System.out.println("File Renamed Successfully!!");
			}else {
				System.out.println("Somethig went wrong!!");
			}
			
			//Delete the file
			if(newFile.delete()) {
				System.out.println("File Deleted Successfully!!");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

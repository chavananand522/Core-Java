package Oops;

class WrittenTest {
	
	int rollno;
	
	WrittenTest (int rollno){
		this.rollno=rollno;
		System.out.println(rollno);
		
	}	
}

public class ThisKeyword {
	public static void main(String[] args) {
		WrittenTest s = new WrittenTest (86);
		
		
	}

}

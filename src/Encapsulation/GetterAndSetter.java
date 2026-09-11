package Encapsulation;

class Student {

	// private attribute (Data hiding)
	private int rollNo;

	// setter method (to set value)
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	// Getter method (to get value)
	public int getRollNo() {
		return rollNo;
	}

}

public class GetterAndSetter {

	public static void main(String[] args) {
		Student s = new Student();

//		setting value using setter
		s.setRollNo(10);

//		Reading value using getter
		System.out.println(s.getRollNo());

	}

}

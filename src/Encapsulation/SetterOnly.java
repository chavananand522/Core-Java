package Encapsulation;

class digitide {

	// private attribute (Data hiding)
	private int empId;

	// setter method (to set value)
	public void setEmpId(int empId) {
		this.empId = empId;
		System.out.println(empId);
	}

}

public class SetterOnly {
	public static void main(String[] args) {

		digitide d = new digitide();

//		Setting the value using setter
		d.setEmpId(151991);
	}

}

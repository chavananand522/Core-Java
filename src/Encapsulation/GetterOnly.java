package Encapsulation;

class digi {

	// private attribute (Data hiding)
	private int empId = 1518991;

	// getter method (to read value)
	public int getEmpId() {
		return empId;
	}

}

public class GetterOnly {

	public static void main(String[] args) {

		digi d1 = new digi();
		System.out.println(d1.getEmpId());

	}

}

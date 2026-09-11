package Oops;

class Stat {
	static String clg = "ASM College";
	int rollNo;

	Stat(int rollNo) {
		this.rollNo = rollNo;
	}

	void garden() {
		System.out.println(rollNo + "   " + clg);
	}

}

public class StaticVariable {

	public static void main(String[] args) {

		Stat s1 = new Stat(7);
		Stat s2 = new Stat(13);

		s1.garden();
		s2.garden();

	}

}

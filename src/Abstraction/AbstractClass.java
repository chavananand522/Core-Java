package Abstraction;

abstract class girlFreind {
	abstract void gf(); // Abstract Method
}

class suchita extends girlFreind {

//	Abstract method extending
	void gf() {
		System.out.println("She is my Half Girlfriend");
	}

	void loml() {
		System.out.println("Cutie Pie");
	}
}

public class AbstractClass {
	public static void main(String[] args) {

		suchita s = new suchita();
		s.gf();
		s.loml();
	}
}

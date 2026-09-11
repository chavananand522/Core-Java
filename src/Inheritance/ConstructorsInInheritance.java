package Inheritance;

class Pt {
	Pt() {
		System.out.println("Type c");
	}
}

class Cd extends Pt {
	Cd() {
		super();
		System.out.println("Parent constructor called");
	}
}

public class ConstructorsInInheritance {

	public static void main(String[] args) {
		Cd c1 = new Cd(); // Constructor automatically calls
	}

}

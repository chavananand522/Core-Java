package Inheritance;

class Pt1 {
	Pt1(int x) {
		System.out.println("Type c1");
	}
}

class Cd1 extends Pt1 {
	Cd1() {
		super(90);     //Must call parent constructor 
		System.out.println("Parent constructor called1");
	}
}


public class ParameterisdConstructor {

	public static void main(String[] args) {
		
		Cd1 c1 = new Cd1(); // Constructor automatically calls
	}

}

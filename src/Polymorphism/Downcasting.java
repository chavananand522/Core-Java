package Polymorphism;

class pt4 {
	void show4() {
		System.out.println("Parent class");
	}
}

class cd4 extends pt4 {
	@Override
	void show4() {
		System.out.println("child class");
	}
}

public class Downcasting {

	public static void main(String[] args) {
		
		pt4 p = new cd4();   // Upcasting 
		cd4 c = (cd4)p ;	// Downcasting
		c.show4();

	}

}

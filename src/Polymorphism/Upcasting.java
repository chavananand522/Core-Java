package Polymorphism;

class pt3 {
	void show3() {
		System.out.println("Parent class");
	}
}

class cd3 extends pt3 {
	@Override
	void show3() {
		System.out.println("child class");
	}
}

public class Upcasting {

	public static void main(String[] args) {
		pt3 p = new cd3();  // Upcasting 
		p.show3(); 
	}

}

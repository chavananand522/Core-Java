package Abstraction;

interface Demo {
	void demon(); // Only one abstract class
}

class xyz implements Demo {
	public void demon() {
		System.out.println("Functional interface");
	}
}

public class FunctionalInterface {
	public static void main(String[] args) {

		xyz x = new xyz();
		x.demon();
	}
}

package Oops;

class Geeks {
	static int a = 80;
	static int b = 73;

	static {
		b = a * 3;
		System.out.println("Static block ");
	}
}

public class StaticBlock {
	public static void main(String[] args) {
		System.out.println("Value of b = " + Geeks.b);
	}
}

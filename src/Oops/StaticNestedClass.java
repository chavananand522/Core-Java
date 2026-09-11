package Oops;

class Outer {
	static class Inner {
		static void show() {
			System.out.println("Static nested class ");
		}
	}
}

public class StaticNestedClass {
	public static void main(String[] args) {
		Outer.Inner.show();
	}
}

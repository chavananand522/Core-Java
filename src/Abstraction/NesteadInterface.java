package Abstraction;

class outer {
	interface inner {
		void display();
	}
}

class test implements outer.inner {     //Accessing inner interface from outer class
	public void display() {
		System.out.println("Nestead interface");
	}
}

public class NesteadInterface {
	public static void main(String[] args) {

		test t = new test ();
		t.display();		
	}
}

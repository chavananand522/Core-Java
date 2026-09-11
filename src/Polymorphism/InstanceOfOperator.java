package Polymorphism;

class pt5 {}

class cd5 extends pt5 {}

public class InstanceOfOperator {

	public static void main(String[] args) {
		
		pt5 o = new cd5 ();
		System.out.println( o instanceof cd5);    //used to check whether an object belongs to a particular class or not.
		System.out.println("O is instance of cd5 class ");
	}

}

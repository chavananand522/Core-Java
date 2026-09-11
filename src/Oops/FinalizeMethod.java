package Oops;

class Demo {
	protected void finalize() { // Called by the garbage collector
		System.out.println("Garbage collection done");
	}
}

public class FinalizeMethod {
	public static void main(String[] args) {

		Demo d = new Demo();
		d = null; // Eligible for garbage collection
		System.gc(); // Requesting JVM to run Garbage collector
	}

}

package Abstraction;

interface girl {
	void butki(); // Abstract method
}

class nikita implements girl {
	public void butki() {
		System.out.println("She is butki but cute at a time");
	}
}

public class Interface {
	public static void main(String[] args) {

		nikita n = new nikita();
		n.butki();
	}
}

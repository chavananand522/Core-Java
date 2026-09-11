package Polymorphism;

final class pt7 {
	void show7() {
		System.out.println("Sahi hai Bhaay");
	}
}

//class cd7 extends pt7 {}  (Cannot be inherited)

public class FinalClass {
	public static void main(String[] args) {
		pt7 n = new pt7();
		n.show7();
	}

}

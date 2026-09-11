package Polymorphism;

class pt6 {
	 final void show6() {
		 System.out.println("Sahi hai Bhaay");
	}
}

class cd6 extends pt6 {
//	void show6() {         (Cannot be overriden)
//	}
}

public class FinalMethod {
	public static void main(String[] args) {
		pt6 i = new pt6 ();
		i.show6();
	}

}

package Inheritance;

class Nagorao {
	void npm () {
		System.out.println("Baap hu main! ");
	}
}

class karan extends Nagorao {
	void ktm(){
		System.out.println("My name is Karan");
	}
}

class karina extends Nagorao {
	void kmt(){
		System.out.println("My name is Karina");
	}
}

public class Hierarchialinheritance {

	public static void main(String[] args) {

		karan k1 = new karan();
		k1.npm();
		k1.ktm();

		karina k2 = new karina();
		k2.npm();
		k2.kmt();

	}

}

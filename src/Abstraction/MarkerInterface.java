package Abstraction;

//Marker interface (No Methods)
interface calculus {
}

class intergration implements calculus {
	void show() {
		System.out.println("It is my favourate topic in calculus");
	}
}

public class MarkerInterface {
	public static void main(String[] args) {

		intergration i = new intergration();
		i.show();
	}
}

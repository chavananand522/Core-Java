package Oops;

class Myname {
	String n;

	Myname(String name) {
		n = name;
	}

	void display() {
		System.out.println(n);
	}
}

public class Constructor {
	public static void main(String[] args) {
		Myname s = new Myname("Anand");
		s.display();
	}

}

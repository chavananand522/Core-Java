package Abstraction;

interface x {
	void show1();
}

//Extended interface 
interface y extends x {
	void show2();
}

class asm {
	public void show1 () {
		System.out.println("Me=> It is my clg");
	}
	
	public void show2 () {
		System.out.println("She=> Seriously ? ");
	}
}

public class ExtendedInterface {
	public static void main(String[] args) {

		asm a = new asm ();
		a.show1();
		a.show2();		
	}
}

package Oops;

class Const {

	String name;
	int age;

	Const() {
		name = "Unkonwn";
		age = 0;
	}

	Const(String s) {
		name = s;
		age = 0;

	}

	Const(String n, int i) {
		name = n;
		age = i;
	}

	void dis() {
		System.out.println(name + " " + age);
	}

}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Const c1 = new Const();
		c1.dis();
		
		Const c2 = new Const("Sandesh");
		c2.dis();

		Const c3 = new Const("Sandesh",19);
		c3.dis();	
		
	}

}

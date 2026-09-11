package Inheritance;

class Parent {
	int marks = 89;
	String name = "Suchita";

	void Bagic() {
		System.out.println("She is working 9-6");
	}
}

class Child extends Parent {
	int age = 26;

	void Cute() {
		Bagic();
		System.out.println("She is Cute " +
		" Her age is = " + age +
		" Marks she has = " + marks +
		" Her name is =  " + name);
	}

}

public class SingleInheritance {
	public static void main(String[] args) {

		Child c = new Child();
		c.Cute();
	}

}

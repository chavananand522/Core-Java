package Oops;

class Person {

//	States (Variables)
	String name;
	int age;
	long mobileNo;
	String Address;

//	Behaviors (Methods)
	void eat(String food, String course) {
		System.out.println("Eating " + food + " Eating for " + course);
	}

	void sleep(int hours) {
		System.out.println("Sleeping Hours= " + hours);
	}

	void walk() {
		System.out.println("Walking");
	}

}

public class ClassAndObject {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();

		p1.name = "Sandesh";
		p1.age = 19;
		p1.mobileNo = 90211846094l;
		p1.Address = "Georai";

		p2.name = "Anand";
		p2.age = 21;
		p2.mobileNo = 902291963l;
		p2.Address = "Pune";

		System.out.println(p1.name + " " + p1.age + " "+ p1.mobileNo+ " " +p1.Address);
		System.out.println(p2.name + " " + p2.age + " "+ p2.mobileNo+ " " +p2.Address);
		
		p1.eat("Maggie", "Lunch");
		p1.sleep(8);

		p2.eat("Biryani", "Dinner");
		p2.sleep(6);

	}

}

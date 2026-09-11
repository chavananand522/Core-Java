package Inheritance;

class Animal {
	void sound() {
		System.out.println("Animals sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Barking");
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
	}

}

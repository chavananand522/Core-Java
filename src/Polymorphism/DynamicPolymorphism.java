package Polymorphism;

class pt2 {
	void show2() {
		System.out.println("Parent class");
	}
}

class cd2 extends pt2 {
	@Override
	void show2() {
		System.out.println("child class");
	}
}

public class DynamicPolymorphism {

	public static void main(String[] args) {
		pt2 p = new cd2();	//Parent reference child object 
		p.show2();	//Runtime method calling 
	}

}

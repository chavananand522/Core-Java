package Oops;

class parameterised {
	String name;

	parameterised(String n) {
		name = n;
	}

	void parameter() {
		System.out.println(name);
	}

}

public class ParameterisedConstructor {

	public static void main(String[] args) {
		parameterised pm = new parameterised("Sandesh");
		pm.parameter();

	}

}

package Oops;

class Student {

	int add() {
		return 0;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	double mul(int a, double b) {
		return a * b;
	}

	void val(int a, int b) {
		System.out.println("int+int = " + a + b);
	}

	void multiplication(float f, long w) {
		System.out.println("float * double = " + f * w);
	}

	void chararcter(char c, int a) {
		System.out.println("char * int = " + c * a);
	}

}

public class MethodOverlaoding {
	public static void main(String[] args) {

		Student m = new Student();
		System.out.println(m.add());
		System.out.println(m.add(89, 76, 3));
		System.out.println(m.mul(8, 234));

		m.val(8, 76532);
		m.multiplication(88.3f, 873l);
		m.chararcter('e', 'f');
	}

}

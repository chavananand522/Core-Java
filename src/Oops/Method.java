package Oops;

class Sample {
	void SendMassage() {
		System.out.println("Hello from method");
	}

	int add(int a, int b) {
		return a + b;
	}

	void display(int marks, String name, int age) {
		System.out.println("Marks =" + marks);
		System.out.println("Name =" + name);
		System.out.println("Age =" + age);
	}

	String evenOdd(int num) {
		if (num % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}
}

public class Method {
	public static void main(String[] args) {
		Sample s = new Sample();

		System.out.println("Before method call");
		s.SendMassage();
		System.out.println("After method call");

		System.out.println("Sum = " + s.add(8, 9));

		s.display(73, "Sandesh", 19);
		s.display(33, "Vivek", 23);
		s.display(98, "Jerry", 21);

		System.out.println(s.evenOdd(9));
		System.out.println(s.evenOdd(870));
		System.out.println(s.evenOdd(32));

	}
}








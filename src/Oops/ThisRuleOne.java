package Oops;

class Employee {
	int age;

	Employee() {
		System.out.println("Default");
	}

	Employee(int age) {
		this();
		System.out.println("Age =" + age);
	}

}

public class ThisRuleOne {
	public static void main(String[] args) {
		Employee emp = new Employee(18);
	}

}

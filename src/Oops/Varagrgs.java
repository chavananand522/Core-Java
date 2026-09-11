package Oops;

class Test {
	int add(int... numbers) {

		int sum = 0;
		for (int num : numbers) {
			sum += num; // sum = sum+num
		}
		return sum;
	}
}

public class Varagrgs {
	public static void main(String[] args) {

		Test s = new Test();
		System.out.println(s.add(9, 64, 983));
		System.out.println(s.add(987723, 3982, 320983));
		System.out.println(s.add(937, 9732, 343));
	}
}

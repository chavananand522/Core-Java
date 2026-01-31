package basic;

import java.util.Scanner;

/*Prime number is number that divisible by just 1 and itself*/

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		boolean flag = true;

		for (int i =2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}

		}

		if (flag) {
			System.out.println("Prime Number =" + num);
		} else {
			System.out.println("Not a Prime Number=" + num);
		}

		sc.close();
	}

}

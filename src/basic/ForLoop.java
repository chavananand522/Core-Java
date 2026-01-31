package basic;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hello world" + (i));
		}

		long limit = sc.nextLong();

		for (long i = 1; i <= limit; i += 2)
			System.out.println(i);

		for (long i = limit; i >= 1; i-=5)
			System.out.println(i);

		sc.close();

	}

}

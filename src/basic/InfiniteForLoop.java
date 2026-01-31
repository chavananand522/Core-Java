package basic;

import java.util.Scanner;

public class InfiniteForLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int limit = sc.nextInt();
		sc.close();

//		Using for loop
		for (;;) {
			System.out.println(limit);
		}

	}

}

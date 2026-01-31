package basic;

import java.util.Scanner;

/*Write a program to check if the number entered is even or odd
 * using Not operator
 */

public class LogicalNotOperator {

	public static void main(String[] args) {

		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (!(num % 2 == 0)) {
			System.out.println("Even Number");

		} else {
			System.out.println("Odd Number");
		}
		sc.close();
	}

}

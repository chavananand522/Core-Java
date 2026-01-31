package basic;

import java.util.Scanner;

public class NestedIfElseStatement {

	public static void main(String[] args) {
		/*
		 * Write a program to find if the number entered by the user is divisible by 5,
		 * 7 or both
		 */

//		NESTED IF ELSE IF STATEMENT

		System.out.println("Enter a Value");
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		if (num % 5 == 0) {
			if (num % 7 == 0) {
				System.out.println("No. is divisible by 5 and 7");
			} else {
				System.out.println("No. is divisible by 5 but not 7");
			}
		} else {
			if (num % 7 == 0) {
				System.out.println("No. is divisible by 7 not by 5");
			} else {
				System.out.println("No. is not divisible by 7 and 5");
			}
		}

		s.close();

	}

}

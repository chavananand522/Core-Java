package basic;

import java.util.Scanner;

public class LogicalOrOperator {

	public static void main(String[] args) {

		/*
		 * Write a program to check if the character entered by user is a vowel or
		 * consonent
		 */

		System.out.println("Enter a Character");

		Scanner sc = new Scanner(System.in);
		char c = sc.next().toLowerCase().charAt(0);

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("Character is Vowel");
		} else {
			System.out.println("Character is Consonent");
		}
		sc.close();

	}

}

package basic;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {

		System.out.println("Academic Status");

		Scanner s = new Scanner(System.in);

		int marks = s.nextInt();

		if (marks > 75) {

			System.out.println("A Grade");

		} else if (marks > 63) {
			System.out.println("B Grade");
		} else if (marks > 50) {
			System.out.println("C Grade");

		} else if (marks > 35) {
			System.out.println("Fail");
		} else {
			System.out.println("Invalid Result");
		}
		s.close();

	}

}

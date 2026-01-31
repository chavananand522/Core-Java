package basic;

import java.util.Scanner;

public class IfelseIfLadder {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Obtained Marks");

		int marks = s.nextInt();

		if (marks <= 100) {
			System.out.println("A grade");
		}

		s.close();

	}

}

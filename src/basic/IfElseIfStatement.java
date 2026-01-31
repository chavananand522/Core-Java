package basic;

import java.util.Scanner;

public class IfElseIfStatement {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter Obtained Marks");

		int marks = s.nextInt();

		if (marks >= 35) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		s.close();
	}

}

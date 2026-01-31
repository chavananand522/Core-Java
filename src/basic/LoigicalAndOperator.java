package basic;

import java.util.Scanner;

public class LoigicalAndOperator {

	public static void main(String[] args) {

		/*
		 * Write a program to take the marks of the student and find the grade based on
		 * the following chart:
		 *
		 * range grade 100-75 A 75-60 B 60-35 C 35-0 D
		 */

		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int marks = s.nextInt();

		if (marks <= 100 && marks > 75) {
			System.out.println("Grade A");
		} else if (marks <= 75 && marks > 60) {
			System.out.println("Grade B");
		} else if (marks <= 60 && marks > 35) {
			System.out.println("Grade C");
		} else if (marks < 35) {
			System.out.println("Grade D");
		} else {
			System.out.println("Grade is not valid");
		}
		s.close();
	}

}

package basic;

import java.util.Scanner;

public class BereakAndDefaultStatements {

	public static void main(String[] args) {
//		SWITCH STATEMENT

		System.out.println("Enter a day");

		Scanner s = new Scanner(System.in);
		String day = s.next().toLowerCase();

		switch (day) {
		case ("mon"):
			System.out.println("Monday");
			break;

		case ("tue"):
			System.out.println("Tusday");

		case ("wed"):
			System.out.println("Wednesday");

		case ("thu"):
			System.out.println("Thursday");

		case ("fri"):
			System.out.println("Friday");

		case ("sat"):
			System.out.println("Saturday");
			break;

		case ("sun"):
			System.out.println("Sunday");
		
		default:
			System.out.println("Other than Regular Days");
		
		
		}

		s.close();
	}

}

package basic;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
//		SWITCH STATEMENT

		System.out.println("Enter a day");

		Scanner s = new Scanner(System.in);
		String day = s.next().toLowerCase();

		switch (day) {
		case ("mon"):
			System.out.println("Monday");

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

		case ("ssaun"):
			System.out.println("Sunday");

		}

		s.close();
	}

}

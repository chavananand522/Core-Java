package basic;

import java.util.Scanner;

public class ArithematicMenuDrivenApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Infinte loop
		while (true) {
			System.out.println("Select the Artithematic program to be performed: ");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("0.Exit");
			System.out.println("Enter your choice");

			int choice = sc.nextInt();

			if (choice == 0) {
				break;
			} else if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
				System.out.print("Enter any number");
				int num1 = sc.nextInt();

				System.out.print("Enter any number");
				int num2 = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Sum =" + (num1 + num2));
					break;
				case 2:
					System.out.println("Sum =" + (num1 - num2));
					break;
				case 3:
					System.out.println("Sum =" + (num1 * num2));
					break;
				case 4:
					System.out.println("Sum =" + (num1 / num2));
					break;

				}
			} else {
				System.out.println("Please enter the correct choice");
			}

		}

		sc.close();
	}
}

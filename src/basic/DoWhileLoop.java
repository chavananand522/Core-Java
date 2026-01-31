package basic;

import java.util.Scanner;

/*
 * Write a program to print the sum of all the positive numbers 
 * provided by the user
 */

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

        System.out.println("Enter positive numbers (enter 0 or negative number to stop)");
		
		int sum = 0;

		do {
			System.out.println("Enter any number");
			num = sc.nextInt();   //Update Sum
			sum += num;
		} while (num > 0);

		
		System.out.println("sum ="+ sum);
		sc.close();
	}

}

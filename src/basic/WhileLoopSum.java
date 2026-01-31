package basic;

import java.util.Scanner;

/*
 * Write a program to print the sum of all the positive numbers 
 * provided by the user
 */


public class WhileLoopSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
        System.out.println("Enter positive numbers (enter 0 or negative number to stop)");

		
		int sum = 0;
		
		while (num>0) {
			sum+=num;
			System.out.println(sum);
			num=sc.nextInt();     //Update Sum
			
		}
		
		System.out.println("Sum ="+sum);
		

	sc.close();}

}

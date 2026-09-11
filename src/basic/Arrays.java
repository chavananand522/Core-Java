package basic;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Give the size for an Array");
		int size = sc.nextInt();
		int number[] = new int[size]; // Size given by the user.

//		Input values 
		for (int i = 1; i < size; i++) {
			System.out.println("Give the input for an Array");			
			number[i] = sc.nextInt();
		}

//		Output values
		for (int i = 1; i < size; i++) {
			System.out.print(i);
		}

		sc.close();
	}

}

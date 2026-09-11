package basic;

import java.util.Scanner;

public class UserGivenPyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Give any number");
		int num = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}

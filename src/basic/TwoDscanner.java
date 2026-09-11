package basic;

import java.util.Scanner;

public class TwoDscanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of rows");
		int rows = sc.nextInt();

		System.out.print("Enter no. of cols");
		int cols = sc.nextInt();

		System.out.println("Give matrix according to rows an cols");
		int arr[][] = new int[rows][cols];

		// Input
		// Rows
		for (int i = 0; i < rows; i++) {
			// Columns
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

//		Printing the given output
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
		sc.close();
	}

}

package basic;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2 }, { 4, 8 }, { 8, 40 } };

		//		Outer loop Rows 
		for (int i = 0; i < arr.length; i++) {
//			Inner loop Rows 
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
package basic;

import java.util.Scanner;

public class myScanner {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		char c1= s.next().charAt(0);
		
		System.out.println("I really like you "+c1);
	}

}

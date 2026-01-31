package basic;

public class BitwiseOperator {

	public static void main(String[] args) {

		int a = 10;
		int b = 80;
		int c = -8;
		

		System.out.println("Bitwise And (&) =" + (a & b));
		System.out.println("Bitwise OR (|)=" + (a | b));
		System.out.println("Bitwise XOR(^)=" + (a ^ b));

		System.out.println("Bitwise NOT (~)=" + (~a));
		System.out.println("Bitwise NOT (~)=" + (~c));
		
		System.out.println("Bitwise Right Shift(>>)"+(a>>1) );
		System.out.println("Bitwise Right Shift(>>)"+(a>>2) );
		
		System.out.println("Bitwise Left Shift (<<)"+ (a<<1));
		System.out.println("Bitwise Left Shift (<<)"+ (a<<2));
		
	}

}

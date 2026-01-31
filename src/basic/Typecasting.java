package basic;

public class Typecasting {

	public static void main(String[] args) {

//		IMPLICIT TYPECASTING

		byte a = 59;
		short b = a;

		int c = b;
		long d = c;

		float e = d;
		double f = e;

		System.out.println(f);

		char c1 = 'h';
		int c2 = c1;
		System.out.println(c2);

//		EXPLICIT TYPING 

		double x = 897487.9;
		float y = (float) x;

		long z = (long) y;
		int w = (int) z;

		short v = (short) w;
		byte u = (byte) v;

		System.out.println(u);
		
		int c5 = 70;
		char c6 = (char)c5;
		
		System.out.println(c6);
		
	}

}

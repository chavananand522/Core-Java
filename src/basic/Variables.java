package basic;

public class Variables {

	public static void main(String[] args) {

		System.out.println("welcome to java");

//		INTEGER TYPE DATATYPES
		byte b = 127;
		short c = 18923;
		int a = 278784890;

		long d = 782783l; /*
							 * Normal whole number literal is considered as int, If that literal has to be
							 * considered as long, we need suffix the literal with l or L
							 */

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

//		FLOATING POINT TYPE DATATYPES
		float e = 134.4f;
		double f = 1837.90; /*
							 * If we want to specify the literal as double we can suffix the literal with d
							 * or D
							 */

		System.out.println(e);
		System.out.println(f);

//		CHARACTER TYPE DATATYPE
		char c1 = 'j';
		System.out.println(c1);
		
//		BOOLEAN TYPE DATATYPE
		boolean b1 = true; 
		boolean b2 = false; 
		
		System.out.println(b1);
		System.out.println(b2);


	}

}

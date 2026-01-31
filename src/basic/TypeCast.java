package basic;

public class TypeCast {

	public static void main(String[] args) {

//		IMPLICI TYPECASTING

		byte a = 90;
		System.out.println(a);

		short b = a;
		System.out.println(b);

		int c = b;
		System.out.println(c);

		long d = c;
		System.out.println(d);

		long e = d;
		System.out.println(e);

		float f = e;
		System.out.println(f);

		double j = f;
		System.out.println(j);

		char c1 = 'X';
		System.out.println(c1);

		int z = c1;
		System.out.println(z);

//		EXPLICIT TYPECASTING 

		double o = 50.88;
		System.out.println(o);

		float p = (float) o;
		System.out.println(p);

		long q = (long) p;
		System.out.println(q);

		int r = (int) q;
		System.out.println(r);

		short s = (short) r;
		System.out.println(s);

		byte t = (byte) s;
		System.out.println(t);
		
		int marks = 100;
		System.out.println(marks);
		
		char c2= (char)marks;
		System.out.println(c2);

	}

}

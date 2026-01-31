package basic;

public class ArithematicOperator {
	public static void main(String[] args) {

//		 BINARY ARITHEMATIC OPERATOR 
		int a = 20;
		int b = 70;
		int c = 93;
		int d = 28930;

		int sum = a + b;
		int sub = b - c;
		int mul = d * a;
		int div = c / d;
		int mod = a % b;

		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);

		System.out.println(d + a);
		System.out.println(c * d);
		System.out.println(b * d);
		System.out.println(a / b);
		System.out.println(d % a);

//		ARITHEMATIC UNARY OPERATOR
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(++b);
		System.out.println(--d);
		System.out.println(d--);
		System.out.println(--c);
	}

}

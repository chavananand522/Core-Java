package Oops;


class Default{

	int i; 
	byte b;
	short s;
	long l;
	float f;
	double d;
	char c;
	boolean bl;
}

public class DefaultConstructor {

	public static void main(String[] args) {
		Default df = new Default();    //Default constructor called 
		System.out.println(df.i);
		System.out.println(df.b);
		System.out.println(df.s);
		System.out.println(df.l);
		System.out.println(df.f);
		System.out.println(df.d);
		System.out.println(df.c);
		System.out.println(df.bl);
	}

}

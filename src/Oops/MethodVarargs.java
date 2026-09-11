package Oops;

public class MethodVarargs {

//	Normal Array passing
	int addArrayValues(int[] values) {
		int sum = 0;
		for (int i : values) {
			sum += i;
		}
		return sum;
	}
	
//		Varargs passing
	int addVarargs(int... values) {
		int sum = 0;
		for (int i : values) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {

		int arr[] = { 4, 3, 94, 83, 4, 884, 39843 };
		MethodVarargs m = new MethodVarargs();
		System.out.println(m.addArrayValues(arr));

		System.out.println(m.addVarargs(7, 4, 4, 397, 9723, 973847, 9734));

	}

}

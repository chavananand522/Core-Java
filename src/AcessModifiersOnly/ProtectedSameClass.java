package AcessModifiersOnly;

class ProtectedSameClass {

	protected int age = 21;

	protected void show() {
		System.out.println("Age is " + age);
	}

	public static void main(String[] args) {

		ProtectedSameClass n = new ProtectedSameClass();
		n.show();

	}

}

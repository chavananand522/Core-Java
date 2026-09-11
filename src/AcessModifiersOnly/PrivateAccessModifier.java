package AcessModifiersOnly;

class Dy {
	private void Girl() {
		System.out.println("Simran");
	}

	void boy() {
		Girl();
	}

}

public class PrivateAccessModifier {

	public static void main(String[] args) {

		Dy dpu = new Dy();
		dpu.boy();
	}

}

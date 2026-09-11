package Oops;

class Digitide {
	void emp() {
		System.out.println("Gareeb bachhe BKl");
	}
	
	void sal() {
		System.out.println("Chal na");
		this.emp();
	}
}

public class ThisRuleThree {

	public static void main(String[] args) {
		
		Digitide d = new Digitide ();
		d.sal();
	}

}

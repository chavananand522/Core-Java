package Inheritance;

class GrandParent {
	void shotNo1() {
		System.out.println("SHOT NO.1");
	}
}

class Parent1 extends GrandParent {
	void shotNo2() {
		System.out.println("SHOT NO.2");
	}
}

class Beta extends Parent1 {
	void shotNo3() {
		shotNo1();
		shotNo2();
		System.out.println("SHOT NO.3");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Beta d = new Beta();
		d.shotNo3();

	}

}

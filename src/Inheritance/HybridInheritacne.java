package Inheritance;

class x {
	void showX() {
		System.out.println("Class X");
	}
}

class y extends x {
	void showY() {
		System.out.println("Class Y");
	}
}
	class z extends x {
		void showZ() {
			System.out.println("Class Z");
		}
	}
		class w extends z {
			void showW() {
				System.out.println("Class W");
			}
		}
public class HybridInheritacne {

	public static void main(String[] args) {

		w obj = new w();
		obj.showX();
		obj.showZ();
		obj.showW();
		}

}

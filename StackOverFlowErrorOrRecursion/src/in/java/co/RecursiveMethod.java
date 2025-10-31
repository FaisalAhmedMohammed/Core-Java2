package in.java.co;

public class RecursiveMethod {

	int a = 10;

	static void m1() {
		System.out.println("inside m1() method");
		m1();
	}

	public static void main(String[] args) {
		System.out.println("Main");
		m1();
	}

}

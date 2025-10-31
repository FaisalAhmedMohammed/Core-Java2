package in.java.co;

public class AccessingNewSvInSB {
	static int a = 10;
	static {
		System.out.println("In Static Block");
		System.out.println(a);
		System.out.println(AccessingNewSvInSB.b);

		b = 50;
		System.out.println(AccessingNewSvInSB.b);
	}

	public static void main(String[] args) {
		System.out.println("In Main Method");
		System.out.println(a);
		System.out.println(b);
	}

	static int b;

}

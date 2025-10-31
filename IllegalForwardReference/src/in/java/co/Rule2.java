package in.java.co;

public class Rule2 {
	static int a = 10;
	static {
		System.out.println("In Static Block");
		System.out.println(a);
		System.out.println(Rule2.b);

		b = 50;
		// System.out.println(b);Rule we cannot access before its declaration but we can
		// modify it
		System.out.println(Rule2.b);
	}

	public static void main(String[] args) {
		System.out.println("In Main Method");
		System.out.println(a);
		System.out.println(b);
	}

	static int b;
}

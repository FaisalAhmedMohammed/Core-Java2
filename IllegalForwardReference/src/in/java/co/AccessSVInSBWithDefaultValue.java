package in.java.co;

public class AccessSVInSBWithDefaultValue {
	static int a = 10;

	static {
		System.out.println("In Static Block");
		System.out.println(a);
		// System.out.println(b);
		System.out.println(AccessSVInSBWithDefaultValue.b);
	}
	static int b = 20;

	public static void main(String[] args) {
		System.out.println("In Main Method");
		System.out.println(a);
		System.out.println(b);
	}

}

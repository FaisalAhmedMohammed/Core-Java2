package in.java.co;

public class SVDefaultValue {
	// static int a = b;here we will get error because of default value of b
	static {
		System.out.println("In static block");
		// System.out.println(a);
		// System.out.println(b);
	}

	public static void main(String[] args) {
		// System.out.println(a);
		System.out.println(b);

	}

	static int b = 20;

}

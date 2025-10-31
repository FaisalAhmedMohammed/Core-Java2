package in.java.co;

public class AccessSVInSVDeclaration {

	static int a = 10;
	static int b = a;
	// static int c = d;
	// d=a;

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		// System.out.println(c);
		System.out.println(d);
	}

	static int d = 20;

}

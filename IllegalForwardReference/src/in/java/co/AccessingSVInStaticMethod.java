package in.java.co;

public class AccessingSVInStaticMethod {
	static int a = 10;
	static {
		System.out.println("In static block");
		System.out.println(a);
		System.out.println(AccessingSVInStaticMethod.b);
	}

	static void m1() {
		System.out.println("In M1() Method");
		System.out.println(a);
		System.out.println(b);// here i am accessing SV before its declaration then also not getting error
								// because in methods compiler assumes it may be 0 or assigned value

	}

	public static void main(String[] args) {
		System.out.println("In Main method");
		System.out.println(a);
		System.out.println(b);

	}

	static int b = 50;

}

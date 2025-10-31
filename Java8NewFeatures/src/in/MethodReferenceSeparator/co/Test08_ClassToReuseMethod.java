package in.MethodReferenceSeparator.co;

public class Test08_ClassToReuseMethod {
	static void m1(String s) {
		System.out.println(s);
	}

	void m2(String s) {
		System.out.println(s);
	}

	public Test08_ClassToReuseMethod(String s) {
		System.out.println(s);
	}

}

package in.privatemethod.co;

public interface Test01_CreatingPrivateMethods {

	void m1();

	void m2();

	static void m3() {
		System.out.println("static method");
		m7();
	}

	static void m4() {
		m7();
	}

	default void m5() {
		m8();
	}

	default void m6() {
		m8();
	}

	private static void m7() {

	}

	private void m8() {

	}

}

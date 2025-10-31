package in.staticMethod.co;

public interface CreatingStaticMethod {
	void m1();

	static void m2() {
		System.out.println("Interface static method");
	}

}

class SM implements CreatingStaticMethod {
	@Override
	public void m1() {
		System.out.println("SM abstract Method");
	}
}

package in.defaultMethod.co;

public interface CreatingDefaultMethod {
	default void m1() {
		System.out.println("Interface Default method m1");
	}
}

class Demo implements CreatingDefaultMethod {
	@Override
	public void m1() {
		CreatingDefaultMethod.super.m1();
		System.out.println("Demo class Default method");
	}
}


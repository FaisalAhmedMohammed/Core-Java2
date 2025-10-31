package in.defaultMethod.co;

public interface InterfaceAmbiguousI1 {
	void m1();
	default void m2() {
		System.out.println("Inteface  I1 default method");
	}

}

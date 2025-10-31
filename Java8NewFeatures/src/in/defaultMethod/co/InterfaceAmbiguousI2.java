package in.defaultMethod.co;

public interface InterfaceAmbiguousI2 {
	void m1();

	default void m2() {
		System.out.println("Inteface  I2 default method");
	}

}

package in.defaultMethod.co;

public class AmbiguousClass implements InterfaceAmbiguousI1, InterfaceAmbiguousI2 {

	@Override
	public void m1() {
		System.out.println("AmbiguousClass abstract method");
	}

	@Override
	public void m2() {
		//InterfaceAmbiguousI1.super.m2();
		InterfaceAmbiguousI2.super.m2();
	}

	public static void main(String[] args) {
		AmbiguousClass clas = new AmbiguousClass();
		clas.m1();
		clas.m2();
	}

}

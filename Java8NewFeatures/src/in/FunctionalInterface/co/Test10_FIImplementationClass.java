package in.FunctionalInterface.co;

public class Test10_FIImplementationClass implements Test09_OldVersionImplementingFI {

	@Override
	public void m1(int a, int b) {// outer class
		System.out.println(a + b);
	}

}

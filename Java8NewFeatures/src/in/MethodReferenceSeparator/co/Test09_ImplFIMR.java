package in.MethodReferenceSeparator.co;

public class Test09_ImplFIMR {
	public static void main(String[] args) {
		Test07_FICreatingWithStringParam f1 = (s) -> {
			Test08_ClassToReuseMethod.m1(s);
		};
		f1.abc("ashok");

		Test07_FICreatingWithStringParam f2 = Test08_ClassToReuseMethod::m1;
		f2.abc("ravi");

		System.out.println();

		Test07_FICreatingWithStringParam f3 = (s) -> {
			new Test08_ClassToReuseMethod(s).m2(s);

		};
		f3.abc("nivas");

		Test07_FICreatingWithStringParam f4 = new Test08_ClassToReuseMethod("abc")::m2;

		f4.abc("ait");

		System.out.println();

		Test07_FICreatingWithStringParam f5 = (s) -> {
			new Test08_ClassToReuseMethod(s);
		};
		f5.abc("hari krishna");

		Test07_FICreatingWithStringParam f6 = Test08_ClassToReuseMethod::new;
		
		f6.abc("Same");

	}

}

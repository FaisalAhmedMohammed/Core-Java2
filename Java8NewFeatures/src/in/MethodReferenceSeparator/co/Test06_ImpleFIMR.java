package in.MethodReferenceSeparator.co;

public class Test06_ImpleFIMR {
	public static void main(String[] args) {
		Test04_FIWithOutParam f1 = () -> {
			Test05_SImpleClass.m1();
		};
		f1.abc();

		Test04_FIWithOutParam f2 = Test05_SImpleClass::m1;
		f2.abc();
	}

}

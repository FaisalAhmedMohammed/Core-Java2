package in.staticMethod.co;

public class CallingStaticMethod {
	public static void main(String[] args) {
		SM sm = new SM();
		sm.m1();
		CreatingStaticMethod.m2();
	}
}
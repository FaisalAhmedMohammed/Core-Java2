package in.java.co;

public class CallingStaticMethodWithGenerics {
	public static <T> void m1(T t) {
		System.out.println(t.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		CallingStaticMethodWithGenerics.m1(10);
		CallingStaticMethodWithGenerics.m1("Hello");

	}
}

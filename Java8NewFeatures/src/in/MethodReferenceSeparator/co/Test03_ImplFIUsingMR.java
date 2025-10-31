package in.MethodReferenceSeparator.co;

public class Test03_ImplFIUsingMR {
	public static void main(String[] args) {
		Test01_FLCreation f1 = (a, b) -> {
			System.out.println(a + b);
		};
		f1.m1(5, 4);

	}
}

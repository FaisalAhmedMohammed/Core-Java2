package in.MethodReference.co;

public class Test02_CreatingLE {
	public static void main(String[] args) {
		Test01_FI l1 = (a, b) -> System.out.println((a + b));
		l1.add(10, 20);
	}

}

class Test03Add {
	static void m1(int a, int b) {
		System.out.println(a + b);// here logic is same so instead of writing logic just refer it using method
									// reference
	}

	public static void main(String[] args) {
		m1(10, 10);
	}
}

class Test04UsingMethodReferenc {
	public static void main(String[] args) {
		/*est01_FI l1 = (a, b) -> System.out.println((a + b));
		l1.add(10, 20);

		Test01_FI i2 = (a, b) -> {
			Test03Add.m1(10, 20);
		};*/
		Test01_FI i3 = Test03Add::m1;
		i3.add(10, 10);
	}

}
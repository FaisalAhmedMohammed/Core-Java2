package in.CreatingGenericFI.co;

public class Test09_CreatingLEImpl {
	public static void main(String[] args) {
		Test08_ReturiningLE<Integer, Integer> i1 = (a, b) -> {
			return a + b;
		};
		Test08_ReturiningLE<Integer, Integer> i2 = (a, b) -> {
			return a - b;
		};
		Test08_ReturiningLE<Integer, Integer> i3 = (a, b) -> {
			return a * b;
		};
		Test08_ReturiningLE<Integer, Integer> i4 = (a, b) -> {
			return a / b;
		};
		int operation = i1.operation(10, 20);
		int operation2 = i2.operation(10, 20);
		int operation3 = i3.operation(10, 20);
		int operation4 = i4.operation(10, 20);

		System.out.println(operation);
		System.out.println(operation2);
		System.out.println(operation3);
		System.out.println(operation4);
	}

}

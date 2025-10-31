package in.CreatingGenericFI.co;

public class Test07LEImpl {
	public static void main(String[] args) {
		Test06CreatingGenericType<Integer> i1 = (a, b) -> System.out.println((a + b));
		Test06CreatingGenericType<Integer> i2 = (a, b) -> System.out.println((a * b));
		Test06CreatingGenericType<Integer> i3 = (a, b) -> System.out.println((a - b));
		Test06CreatingGenericType<Integer> i4 = (a, b) -> System.out.println((a / b));
		i1.operation(10, 20);
		i2.operation(10, 20);
		i3.operation(10, 20);
		i4.operation(10, 20);
	}

}

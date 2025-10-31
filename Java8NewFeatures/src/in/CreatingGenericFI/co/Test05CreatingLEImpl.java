package in.CreatingGenericFI.co;

public class Test05CreatingLEImpl {
	public static void main(String[] args) {
		Test01_I1 l1 = (a, b) -> System.out.println((a + b));
		Test02_I2 l2 = (a, b) -> System.out.println((a * b));
		Test03_I3 l3 = (a, b) -> System.out.println((a - b));
		Test04_I4 l4 = (a, b) -> System.out.println((a / b));

		l1.add(10, 20);
		l2.mul(10, 20);
		l3.sub(10, 20);
		l4.div(10, 20);
	}

}

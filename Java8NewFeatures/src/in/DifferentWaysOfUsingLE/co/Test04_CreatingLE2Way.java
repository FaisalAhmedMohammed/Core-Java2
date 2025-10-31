package in.DifferentWaysOfUsingLE.co;

public class Test04_CreatingLE2Way {

	public static <T> void performOperatin(int x, int y, Test03_CreatingLE<T> le) {
		int opreatin = le.operation(x, y);
		System.out.println(opreatin);
	}

	public static void main(String[] args) {
		performOperatin(10, 20, (a, b) -> (a + b));
	}
}
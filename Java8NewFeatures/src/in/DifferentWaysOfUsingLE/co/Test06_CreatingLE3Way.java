package in.DifferentWaysOfUsingLE.co;

public class Test06_CreatingLE3Way {
	public Test05_CreatingLE add() {
		return (a, b) -> (a + b);
	}

	public static void main(String[] args) {
		Test06_CreatingLE3Way le = new Test06_CreatingLE3Way();
		Test05_CreatingLE test05_CreatingLE = le.add();

		System.out.println(test05_CreatingLE.add(10, 23));
	}
}

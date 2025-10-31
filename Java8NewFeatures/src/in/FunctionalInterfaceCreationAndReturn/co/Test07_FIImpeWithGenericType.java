package in.FunctionalInterfaceCreationAndReturn.co;

public class Test07_FIImpeWithGenericType {
	public static void main(String[] args) {
		Test06_CreatingGenericType<Integer> gen = (x, y) -> {
			System.out.println(x + " -> " + y);
		};
		Test06_CreatingGenericType<String> gen2 = (String a, String b) -> {
			System.out.println(a + " " + b);
		};
		Test06_CreatingGenericType<Double> gen3 = (Double a, Double b) -> {
			System.out.println(a + " " + b);
		};
		gen.opeation(10, 2);
		gen2.opeation("ashok", "it");
		gen3.opeation(10.0, 15.5);
	}

}

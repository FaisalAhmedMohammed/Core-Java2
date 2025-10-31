package in.FunctionalInterfaceCreationAndReturn.co;

public class Test09_FIImpleEithReturn {
	public static void main(String[] args) {
		Test08_FIWithParaWIthReturn<Integer, Integer> f1 = (a) -> {
			return a;
		};

		Test08_FIWithParaWIthReturn<String, String> f2 = (x) -> {
			return x;
		};

		Test08_FIWithParaWIthReturn<Double, Double> f3 = (a) -> {
			return a;
		};

		int operation = f1.operation(10);
		String operation2 = f2.operation("Java is a programming language");
		double operation3 = f3.operation(20.0);

		System.out.println(operation);
		System.out.println(operation2);
		System.out.println(operation3);
	}

}

package in.MethodReference.co;

public class Example02CallingMethodReference {
	public static void main(String[] args) {

		Example01MethodReference ex = (a, b) -> System.out.println((a + b));

		Example01MethodReference example = (a, b) -> {
			Example02CreatingMF.display(5, 5);
		};
	}

}

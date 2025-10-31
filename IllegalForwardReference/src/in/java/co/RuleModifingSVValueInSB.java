package in.java.co;

public class RuleModifingSVValueInSB {
	static int a = 10;
	static {
		System.out.println("In Static Block");
		System.out.println(a);
		System.out.println(AccessSVInSBWithDefaultValue.b);

		b = 50;
	}

	public static void main(String[] args) {
		System.out.println("In Main Method");
		System.out.println(a);
		System.out.println(b);
	}

	static int b;

}

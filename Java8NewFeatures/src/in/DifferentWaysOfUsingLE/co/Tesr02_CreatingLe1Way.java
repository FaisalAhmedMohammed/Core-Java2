package in.DifferentWaysOfUsingLE.co;

public class Tesr02_CreatingLe1Way {
	public static void main(String[] args) {
		Test01_CreatingLE<String> le = t -> System.out.println(t);

		le.m1("Java is a programming language");
	}

}

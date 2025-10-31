package in.FunctionalInterfaceCreationAndReturn.co;

public class Test03_FIImplet {
	public static void main(String[] args) {
		Test01_FICreation f1 = () -> System.out.println("Hello");
		f1.m1();

		System.out.println();

		Test02_FICreation f2 = (x) -> System.out.println(x);
		f2.m1(20);

	}

}

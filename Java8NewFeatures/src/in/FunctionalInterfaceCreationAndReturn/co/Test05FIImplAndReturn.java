package in.FunctionalInterfaceCreationAndReturn.co;

public class Test05FIImplAndReturn {
	public static void main(String[] args) {

		Test04_FICerationWithReturn ret = () -> {
			return 10;
		};
		int m1 = ret.m1();
		System.out.println(m1);

		Test04_FICerationWithReturn f2 = () -> 8;
		int m12 = f2.m1();
		System.out.println(m12);
	}

}

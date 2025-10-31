package in.FunctionalInterface.co;

public class PR02_Demo {
	public static void main(String[] args) {
		PR01_AnonymousInterface ano = new PR01_AnonymousInterface() {
			public void m1(int a, int b) {
				System.out.println("Anonymous Inner Class  : " + (a + b));
			}
		};
		ano.m1(20, 10);
	}

}
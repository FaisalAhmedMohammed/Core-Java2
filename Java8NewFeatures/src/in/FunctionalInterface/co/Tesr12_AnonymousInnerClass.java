package in.FunctionalInterface.co;

public class Tesr12_AnonymousInnerClass {
	public static void main(String[] args) {
		Test12_Addition addition = new Test12_Addition() {//AIC And Method

			@Override
			public void add(int a, int b) {
				System.out.println("From AIC : " + (a + b));

			}
		};
		addition.add(20, 30);
	}
}

package in.FunctionalInterface.co;

public class Test14_LambdaExpression {
	public static void main(String[] args) {
		System.out.println("Main start");
		Test13_AdditionLambdaExpre add = (int a, int b) -> System.out.println("Lambda Expression : "+ (a + b));
		add.addition(10, 20);
		
		System.out.println("Main End");
	}

}

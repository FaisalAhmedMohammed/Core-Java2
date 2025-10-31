package in.java.co;

public class PassingIntInToDoubleType {
	public void m1(double d) {
		System.out.println(d);
	}

	public static void main(String[] args) {
		PassingIntInToDoubleType met = new PassingIntInToDoubleType();
		met.m1(10);// here we will get 10.0 but i want 10 as int not in double 10.0
	}

}

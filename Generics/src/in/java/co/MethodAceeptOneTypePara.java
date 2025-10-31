package in.java.co;

public class MethodAceeptOneTypePara {

	public void m1(int i) {
		System.out.println(i);
	}

	public void m1(double d) {
		System.out.println(d);
	}

	public void m1(String s) {
		System.out.println(s);
	}

	public void m2(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		MethodAceeptOneTypePara met = new MethodAceeptOneTypePara();
		met.m1(10);
		// met.m1("20"); here we will get compile type error
		met.m1(20.0);

		met.m1("hello");

		met.m2(1);
		met.m2(40.0);
		met.m2("hi");
		met.m2('a');
		met.m2(true);

	}

}

package AboutCovarient;

class P {

}

class Q extends P {

}

class A1 {
	P m1() {
		return new P();
	}
}

class B1 extends A1 {
	@Override
	P m1() {
		return new Q();
	}
}

class C1 extends A1 {
	@Override
	Q m1() {
		System.out.println("Hello");
		return new Q();
	}
}

public class Main {
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.m1();
	}

}

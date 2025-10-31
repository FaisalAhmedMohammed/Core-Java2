package in.ConstructorChaining.co;

public class Test02_Chaining {
	int x;
	String name;

	Test02_Chaining() {
		this(10);
		System.out.println(this.hashCode());

	}

	Test02_Chaining(int x) {
		this.x = x;
		System.out.println(this.hashCode());
		System.out.println(x);
	}

	Test02_Chaining(String s) {
		this.name = name;
	}

	public static void main(String[] args) {
		Test02_Chaining obj = new Test02_Chaining();
	}

}

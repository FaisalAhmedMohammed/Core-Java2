package in.ConstructorChaining.co;

public class Test01_WithoutObjectChaining {
	int x;

	Test01_WithoutObjectChaining() {
		System.out.println(this.hashCode());
		new Test01_WithoutObjectChaining(10);

	}

	Test01_WithoutObjectChaining(int x) {
		System.out.println(this.hashCode());
	}

	public String toString() {
		return x + " ";
	}

	public static void main(String[] args) {
		Test01_WithoutObjectChaining obj = new Test01_WithoutObjectChaining();
		System.out.println(obj);
	}

}

package in.java.co;

public class CopyConstructor {
	int a;
	int b;

	public CopyConstructor(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public CopyConstructor(CopyConstructor cp) {
		super();
		this.a = cp.a;
		this.b = cp.b;
	}

	public void display() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {

		CopyConstructor cp = new CopyConstructor(10, 20);

		CopyConstructor ccp = new CopyConstructor(cp);

		cp.display();

		System.out.println();
		ccp.display();

	}

}

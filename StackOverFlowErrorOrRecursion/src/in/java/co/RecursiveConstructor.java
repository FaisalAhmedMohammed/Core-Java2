package in.java.co;

public class RecursiveConstructor {

	int a;

	public RecursiveConstructor(int a) {
		System.out.println("inside constructor");
		this.a = a;
		new RecursiveConstructor(20);
	}

	public static void main(String[] args) {
		System.out.println("inside main");
		RecursiveConstructor rc = new RecursiveConstructor(10);
	}

}

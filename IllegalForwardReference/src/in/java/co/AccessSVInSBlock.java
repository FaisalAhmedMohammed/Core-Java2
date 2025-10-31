package in.java.co;

public class AccessSVInSBlock {
	static int a = 10;

	static {
		System.out.println(a);
		//System.out.println(b);// here we are accessing b variable before its declaration
	}
	static int b = 20;

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
	}

}

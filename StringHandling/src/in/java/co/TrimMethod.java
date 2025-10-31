package in.java.co;

public class TrimMethod {
	public static void main(String[] args) {
		String s1 = "  abc bbc cbc  ";

		int length = s1.length();
		System.out.println(length);

		String trim = s1.trim();
		System.out.println(trim.length());

		String s2 = "   ";
		int length2 = s2.length();
		System.out.println(length2);
		int trim2 = s2.trim().length();
		System.out.println(trim2);
	}

}

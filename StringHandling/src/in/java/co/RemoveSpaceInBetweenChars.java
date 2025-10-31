package in.java.co;

public class RemoveSpaceInBetweenChars {
	public static void main(String[] args) {
		String s1 = " abc bbc cbc ";
		String trim = s1.trim();
		String replace = s1.replace(" ", "");
		System.out.println(s1.length());// 13
		System.out.println(trim.length());// 11

		System.out.println(replace.length());// 9
	}

}

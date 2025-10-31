package in.java.co;

public class ToLowerCase {
	public static void main(String[] args) {
		String s1 = "Abc Bbc Cbc";

		String s2 = s1.toLowerCase();

		String s3 = s1.toLowerCase();

		System.out.println(s2 == s3);
		
		String stt="abc";
		String lowerCase = stt.toLowerCase();
		System.out.println(stt==lowerCase);
		
		String s4="ABC";
		String lowerCase2 = s4.toLowerCase();
		String lowerCase3 = lowerCase2.toLowerCase();
		System.out.println(lowerCase2==lowerCase3);
	}

}

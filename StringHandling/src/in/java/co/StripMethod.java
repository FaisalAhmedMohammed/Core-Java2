package in.java.co;

public class StripMethod {
	public static void main(String[] args) {
		
		String s1="   abc bbc cbc   ";
		
		int length = s1.length();
		System.out.println(length);
		
		System.out.println();
		
		String strip = s1.strip();
		System.out.println(strip.length());
		
		System.out.println();
		
		String s2="\0   ";
		int length2 = s2.length();
		System.out.println(length2);
		
		System.out.println();
		
		String trim = s2.trim();
		System.out.println(trim.length());
		
		String strip2 = s2.strip();
		System.out.println(strip2.length());
		
		
	}

}

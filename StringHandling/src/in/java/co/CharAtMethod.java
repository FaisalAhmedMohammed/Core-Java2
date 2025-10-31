package in.java.co;

public class CharAtMethod {
	public static void main(String[] args) {
		String s1 ="core java";
		char charAt = s1.charAt(5);
		System.out.println(charAt);
		
		char charAt2 = s1.charAt(7);
		System.out.println(charAt2);
		
		char charAt3 = s1.charAt(9);
		//System.out.println(charAt3);// here it will get StringIndexOutOfBounds
	}

}

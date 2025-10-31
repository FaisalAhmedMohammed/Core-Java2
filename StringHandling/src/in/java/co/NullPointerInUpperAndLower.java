package in.java.co;

public class NullPointerInUpperAndLower {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String s1= null;
		String lowerCase = s1.toLowerCase();
		//System.out.println(lowerCase);
		
		String s2="null";
		String upperCase = s2.toUpperCase();
		System.out.println(upperCase);
	}

}

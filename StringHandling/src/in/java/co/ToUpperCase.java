package in.java.co;

public class ToUpperCase {
	public static void main(String[] args) {
		String s1 = "core java";
		String upperCase = s1.toUpperCase();
		System.out.println(upperCase);

		String upperCase2 = upperCase.toUpperCase();
		System.out.println(upperCase == upperCase2);
		
		String specialCharacter="1@3";
		String upperCase3 = specialCharacter.toUpperCase();
		System.out.println(upperCase3==upperCase3);

	}

}

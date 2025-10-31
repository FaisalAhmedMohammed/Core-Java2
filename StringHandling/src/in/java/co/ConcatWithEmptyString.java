package in.java.co;

public class ConcatWithEmptyString {
	public static void main(String[] args) {
		String s1= "ashok";
		String concat = s1.concat("");
		System.out.println(concat);
		
		System.out.println(s1==concat);
	}

}

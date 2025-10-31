package in.java.co;

public class ReplaceACharacter {
	public static void main(String[] args) {
		String s1 = "abc bbc cbc";
		String replace = s1.replace("b", "x");
		System.out.println(replace);

		String replace2 = s1.replace("bc", "y");
		System.out.println(replace2);//ay,by,cy
		
		String replace3 = replace2.replace("bc", "z");
		System.out.println(replace3);
		
		System.out.println(replace2==replace3);
	}

}

package in.java.co;

public class JoinString {
	public static void main(String[] args) {
		String[] s1 = { "java", "is", "a", "programming", "language" };
		String join = String.join("-", s1);
		System.out.println(join);
		
		String[] ch= {"a","b","c","d"};
		String join2 = String.join("-", ch);
		System.out.println(join2);
	}

}

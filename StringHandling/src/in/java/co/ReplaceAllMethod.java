package in.java.co;

public class ReplaceAllMethod {
	public static void main(String[] args) {
		String s1 = "abc bbc cbc";
		String replaceAll = s1.replaceAll("bc", "z");
		System.out.println(replaceAll);

		// replace all with regular expression

		String replaceAll2 = s1.replaceAll("[bc]", "z");
		System.out.println(replaceAll2);

		// replace any character in between a-z with @

		String s2 = "abc 123 cbc";
		String replaceAll3 = s2.replaceAll("[a-z]", "@");
		System.out.println(replaceAll3);

		String replaceAll4 = s2.replaceAll("1", "%");
		System.out.println(replaceAll4);

		String replaceAll5 = s2.replaceAll("12", "%");
		System.out.println(replaceAll5);

		String replaceAll6 = s2.replaceAll("[12]", "%");
		System.out.println(replaceAll6);

		// replace first character

		String s3 = "abc abc cbc";

		String replaceFirst = s3.replaceFirst("a", "1");
		System.out.println(replaceFirst);

	}

}

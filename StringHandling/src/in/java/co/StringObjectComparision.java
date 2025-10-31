package in.java.co;

public class StringObjectComparision {
	public static void main(String[] args) {
		String s1 = "hari";
		String s2 = "hari";

		System.out.println(s1 == s2);

		String s3 = new String("ait");
		String s4 = new String("ait");
		System.out.println(s3 == s4);

		String s5 = "HYD";
		String s6 = new String("HYD");
		String s7 = new String("HYD");
		System.out.println(s6 == s7);

		s5 = null;
		System.gc();
		System.out.println(s5);
		
		System.out.println(s6);
	}

}

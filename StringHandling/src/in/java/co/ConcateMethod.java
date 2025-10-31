package in.java.co;

public class ConcateMethod {
	public static void main(String[] args) {
		String s1 = "shehar";
		s1.concat("Nivas");
		System.out.println(s1);

		String s2 = s1.concat("Nivas");
		System.out.println(s2);
		
		String s3= s1.concat("Reddy");

		// how to know weather concat method is creating new object

		System.out.println(s2 == s3);

		// concat method throws null pointer exception

		/*
		 * s1 = s1.concat(null); System.out.println(s1);
		 */
		String s4="ahmed";
		String concat = s4.concat("");// here new object is not created because of same data
		System.out.println(s4==concat);
	}

}

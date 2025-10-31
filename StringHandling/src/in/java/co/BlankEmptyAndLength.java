package in.java.co;

public class BlankEmptyAndLength {
	public static void main(String[] args) {
		String s1 = "";
		String s2 = " ";
		String s3 = "hari";
		System.out.println(s1.isEmpty() + " " + s1.isBlank());
		System.out.println(s2.isEmpty() + " " + s2.isBlank());
		System.out.println(s3.isEmpty() + " " + s3.isBlank());

		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());

		String s4 = "ashok";
		String[] color = { "red", "green", "blue", "black" };

		System.out.println(s4.isBlank() + "  " + s4.isEmpty() + "  " + s4.length());

		System.out.println(color.length);

		System.out.println(color[1].length());

		String s5 = "nivas";
		String s6 = "nivas";

		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
		
		String s7="Hyd";
		String s8="hyd";
		System.out.println(s7 == s8);
		System.out.println(s7.equals(s8));
		
		System.out.println(s7.equalsIgnoreCase(s8));
		
		

	}

}
package in.java.co;

public class ContentEqualMethod {
	public static void main(String[] args) {

		String s1 = "ashok";

		StringBuffer sBuffer = new StringBuffer("ashok");

		StringBuilder builder = new StringBuilder("ravi"); 

		System.out.println(s1.contentEquals(sBuffer));
		System.out.println(s1.contentEquals(builder));
		
	}

}

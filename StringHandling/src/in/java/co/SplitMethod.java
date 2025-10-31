package in.java.co;

public class SplitMethod {
	public static void main(String[] args) {
		String s1 = "rama krishna";
		String[] split = s1.split("a");
		for (String string : split) {
			System.out.println(string);
		}
		
		String s2= "spring is a framework";
		String[] split2 = s2.split(" ");
		for (String string : split2) {
			System.out.println(string);
		}
	}

}

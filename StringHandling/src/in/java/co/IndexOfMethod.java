package in.java.co;

public class IndexOfMethod {
	public static void main(String[] args) {
		String s1= "hari krishna";
		int indexOf = s1.indexOf("i");
		System.out.println(indexOf);//3
		
		int indexOf2 = s1.indexOf("a");
		System.out.println(indexOf2);
		
		int indexOf3 = s1.indexOf("a",8);
		System.out.println(indexOf3);
	}

}

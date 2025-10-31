package in.java.co;

public class WrapperToString {
	public static void main(String[] args) {

		Integer valueOf = Integer.valueOf("50");
		Long valueOf2 = Long.valueOf("914554384");

		String string = valueOf.toString();

		String string2 = valueOf2.toString();

		System.out.println(string);
		System.out.println(string2);
	}

}

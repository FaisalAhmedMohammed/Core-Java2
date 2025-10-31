package in.java.co;

public class AllTypes1 {
	public static void main(String[] args) {
		Integer valueOf = Integer.valueOf(10);// pdt as wrapper
		System.out.println(valueOf);

		int intValue = valueOf.intValue();// wrapper to int
		System.out.println(intValue);

		Integer valueOf2 = Integer.valueOf("20");// pst to wrapper
		System.out.println(valueOf2);

		int int1 = Integer.parseInt("30");// pst to primitive value
		System.out.println(int1);
		
		String string2 = Integer.toString(50);//primitive to string
		System.out.println(string2);

		Integer valueOf3 = Integer.valueOf(40);// wrapper to string
		String string = valueOf3.toString();
		System.out.println(string);

	}

}

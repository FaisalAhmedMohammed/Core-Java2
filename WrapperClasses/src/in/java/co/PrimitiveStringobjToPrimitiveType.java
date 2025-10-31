package in.java.co;

public class PrimitiveStringobjToPrimitiveType {
	public static void main(String[] args) {
		Integer io1 = new Integer("50");
		Integer io2 = Integer.valueOf("50");

		int int1 = Integer.parseInt("50");
		System.out.println(int1);
		
		long long1 = Long.parseLong("9014554384");
		System.out.println(long1);
		
		String valueOf = String.valueOf(10);
		System.out.println(valueOf);
	}

}

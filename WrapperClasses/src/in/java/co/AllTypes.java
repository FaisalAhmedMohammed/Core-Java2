package in.java.co;

//primitive type wrapper

public class AllTypes {
	public static void main(String[] args) {
		Integer io1 = Integer.valueOf(50);
		System.out.println(io1);

		Long lo1 = Long.valueOf(9014554384L);
		System.out.println(lo1);

		// wrapper to primitive

		int intValue = io1.intValue();
		System.out.println(intValue);

		long longValue = lo1.longValue();

		System.out.println(longValue);

		// primitive String to wrapper

		Integer lo2 = new Integer("50");
		Integer io3 = Integer.valueOf("60");
		System.out.println(io3);

		int intValue2 = lo2.intValue();
		System.out.println(intValue2);

		// primitive string type to primitive type

		int int1 = Integer.parseInt("50");
		System.out.println(int1);

		long long1 = Long.parseLong("9014554384");
		System.out.println(long1);
	}

}

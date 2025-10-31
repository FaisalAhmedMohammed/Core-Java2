package in.java.co;

public class WrapperToPrimitive {
	public static void main(String[] args) {

		int i1 = 50;
		Integer io1 = new Integer(i1);// pdt value as object

		int intValue = io1.intValue();
		System.out.println(intValue);

		long l1 = 9014554384L;
		Long lo1 = new Long(l1);

		long lo2 = lo1.longValue();
		System.out.println(lo2);
	}

}

package in.java.co;

public class PrimitiveToWrapper

{
	public static void main(String[] args) {
		int il = 50;
		Integer io1 = new Integer(50);
		System.out.println(io1);

		Integer io2 = Integer.valueOf(50);

		long l1 = 9014554384L;

		Long lo1 = new Long(9014554384L);// pdt value as object

		Long lo2 = Long.valueOf(9014554384L);// pdt value as object
	}

}

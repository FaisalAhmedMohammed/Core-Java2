package in.java.co;

public class AutoBoxing {
	public static void main(String[] args) {
		Integer io1 = 50;
		Long lo1 = 1234456778990l;

		System.out.println(io1);
		System.out.println(lo1);
		
		int io2 = io1;
 
		long lo2 = lo1;

		System.out.println(io2);
		System.out.println(lo2);
	}

}

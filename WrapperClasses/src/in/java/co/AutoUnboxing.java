package in.java.co;

public class AutoUnboxing {
	public static void main(String[] args) {

		Integer io1 = 10;// auto boxing
		Long lo1 = 20L; // auto boxing

		System.out.println(io1);
		System.out.println(lo1);

		int i1 = io1; // auto un boxing
		long l1 = lo1; // auto un boxing
		System.out.println(i1);
		System.out.println(l1);

	}

}

package in.java.co;

public class PoolingAppliedToByteOnly {
	public static void main(String[] args) {
		Integer io1 = 50;
		Integer io2 = 50;
		System.out.println(io1 == io2);
		Integer io3 = 127;
		Integer io4 = 127;
		System.out.println(io3 == io4);

		Integer io5 = 128;
		Integer io6 = 128;
		System.out.println(io5 == io6);
	}

}

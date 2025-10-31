package in.java.co;

public class WrapperObjectsCompatibility {
	public static void main(String[] args) {

		Integer valueOf = Integer.valueOf(50);

		Long valueOf2 = Long.valueOf(10);

		// System.out.println(valueOf == valueOf2);

		System.out.println(valueOf.equals(valueOf2));

		Integer valueOf3 = Integer.valueOf(50);
		System.out.println(valueOf == valueOf3);
		System.out.println(valueOf2.equals(valueOf3));

	}

}

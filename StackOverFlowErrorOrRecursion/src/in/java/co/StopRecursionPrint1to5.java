package in.java.co;

public class StopRecursionPrint1to5 {

	static int count = 0;

	static void m1() {
		System.out.println("m1() method");
		count++;
		System.out.println("count value: " + count);
		if (count == 5) {
			return;
		}
		m1();

	}

	public static void main(String[] args) {
		m1();
	}

}

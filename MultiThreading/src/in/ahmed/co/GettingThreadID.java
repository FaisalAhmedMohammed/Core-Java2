package in.ahmed.co;

public class GettingThreadID {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		System.out.println(t1.getName() + "" + t1.getId());

		Thread t2 = new Thread();
		System.out.println(t2.getId());

		Thread t3 = new Thread();
		System.out.println(t3.threadId());
	}
}

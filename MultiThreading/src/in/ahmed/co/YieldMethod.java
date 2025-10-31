package in.ahmed.co;

class MyThread23 extends Thread {
	@Override
	public void run() {

		System.out.println(" run Start ");

		for (int i = 1; i <= 10; i++) {
			System.out.println(" run : " + i);
		}
		System.out.println(" run End ");

	}
}

public class YieldMethod {
	public static void main(String[] args) {
		System.out.println(" Main Start ");

		Thread thread = Thread.currentThread();
		// System.out.println(thread.getName());

		MyThread23 mt1 = new MyThread23();
		mt1.start();

		Thread.yield();
		for (int i = 1; i <= 10; i++) {
			System.out.println(" main : " + i);
		}
		System.out.println(" Main End ");
	}

}

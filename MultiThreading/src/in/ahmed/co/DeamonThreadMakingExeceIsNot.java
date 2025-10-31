package in.ahmed.co;

class MyThread22 extends Thread {
	@Override
	public void run() {
		System.out.println("run start : ");
		for (int i = 1; i <= 20; i++) {
			System.out.println("run : " + i);
		}
		System.out.println("run end : ");

	}
}

public class DeamonThreadMakingExeceIsNot {
	public static void main(String[] args) {
		System.out.println(" Main Start ");

		Thread thread = Thread.currentThread();
		System.out.println(thread.isDaemon());

		MyThread22 mt1 = new MyThread22();
		System.out.println(mt1.isDaemon());

		mt1.setDaemon(true);

		// mt1.start();
		mt1.start();
		System.out.println(" Main End ");
	}

}

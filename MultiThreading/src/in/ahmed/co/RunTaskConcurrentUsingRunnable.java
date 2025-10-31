package in.ahmed.co;

class MyThread1 implements Runnable {
	@Override
	public void run() {
		for (int i = 20; i >= 1; i--) {
			System.out.println("run i :" + i);
		}
	}
}

public class RunTaskConcurrentUsingRunnable {
	public static void main(String[] args) {

		System.out.println("Main start");

		MyThread1 mt1 = new MyThread1();
		Thread t1 = new Thread(mt1);
		t1.start();

		for (int i = 1; i <= 20; i++) {
			System.out.println("main i :" + i);
		}
		System.out.println("Main end");

	}

}

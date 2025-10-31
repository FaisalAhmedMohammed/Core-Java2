package in.ahmed.co;

class MyThread24 extends Thread {

	@Override
	public void run() {
		System.out.println("run");
		for (int i = 1; i <= 10; i++) {
			System.out.println(" run : " + i);
		}
	}
}

public class SleepMethod {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main start");

		MyThread24 mt1 = new MyThread24();
		mt1.start();
		Thread.sleep(5000);// forcing thread scheduler to pause current thread and execute other waiting thread

		System.out.println("Main end");
	}

}

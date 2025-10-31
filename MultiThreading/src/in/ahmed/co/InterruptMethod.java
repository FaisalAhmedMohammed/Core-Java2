package in.ahmed.co;

class MyThread25 extends Thread {
	@Override
	public void run() {
		System.out.println("run :");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("IE Exception");
		
		}
		for (int i = 1; i <= 20; i++) {

			System.out.println("run : " + i);
		}
		System.out.println("Thread is resumed");
		System.out.println("run end ");
	}
}

public class InterruptMethod {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main start");

		MyThread25 mt1 = new MyThread25();
		mt1.start();

		Thread.sleep(2000);
		mt1.interrupt();

		System.out.println("Main End");
	}

}

package in.ahmed.co;

class MyThread26 extends Thread {
	@Override
	public void run() {

		System.out.println(" run start ");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= 20; i++) {
			System.out.println("run : " + i);
		}

		System.out.println(" run End");
	}

}

public class JoinMethod {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main start");

		MyThread26 mt1 = new MyThread26();

		mt1.start();// ready to run state

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main : " + i);

			if (i == 5) {
				mt1.join();
			}
		}
		System.out.println("Main end");

	}

}

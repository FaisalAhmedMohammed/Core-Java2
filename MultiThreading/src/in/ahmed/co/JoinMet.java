package in.ahmed.co;

class MyThread27 extends Thread {
	@Override
	public void run() {

		System.out.println("run start");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run End");
	}
}

public class JoinMet {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main start");

		MyThread27 mt1 = new MyThread27();
		mt1.start();
		mt1.join();

		System.out.println("Main End");
	}

}

package in.ahmed.co;

class MyThread28 extends Thread {
	@Override
	public void run() {

		System.out.println("run start");
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		System.out.println("run End");
	}
}

public class JoinWithTime {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main start");

		MyThread28 mt1 = new MyThread28();
		mt1.start();
		mt1.join();

		System.out.println("Main End");
	}

}

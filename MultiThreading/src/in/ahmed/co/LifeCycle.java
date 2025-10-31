package in.ahmed.co;

class MyThread15 extends Thread {
	@Override
	public void run() {

		System.out.println(getState());

		System.out.println("run start");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run end");
	}
}

public class LifeCycle {
	public static void main(String[] args) throws InterruptedException {

		MyThread15 mt1 = new MyThread15();
		System.out.println(mt1.getState());

		mt1.start();
		System.out.println(mt1.getState());

		Thread.sleep(2000);

		System.out.println("mt1 thread :" + mt1.getState());
		
		Thread.sleep(5000);
		System.out.println(mt1.getState());

	}
}
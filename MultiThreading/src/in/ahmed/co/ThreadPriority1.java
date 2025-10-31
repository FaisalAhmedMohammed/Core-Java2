package in.ahmed.co;

class MyThread17 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("run :" + i);
		}
	}
}

public class ThreadPriority1 {
	public static void main(String[] args) {

		MyThread17 mt1 = new MyThread17();
		System.out.println("Mt1 Priority :" + mt1.getPriority());

		Thread t1 = new Thread();
		System.out.println("Main thread Priority : " + t1.getPriority());

		mt1.setPriority(7);
		t1.setPriority(9);

		mt1.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main :" + i);
		}

	}

}

package in.ahmed.co;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 20; i >= 1; i--) {
			System.out.println("run i :"+i);
		}
	}
}

public class RunTaskConcurrent {
	public static void main(String[] args) {
		System.out.println("Main start");
		MyThread mt1 = new MyThread();
		mt1.start();

		for (int i = 1; i <= 20; i++) {
			System.out.println("main i :"+i);
		}
		System.out.println("main end");
	}

}

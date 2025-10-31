package in.ahmed.co;

class MyThread20 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println();
	}
}

public class AboutCurrentObjectUsingRunnable {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());

		MyThread20 mtt = new MyThread20();
		Thread th1 = new Thread(mtt);
		th1.start();

	}

}

package in.ahmed.co;

class MyThread10 extends Thread {
	@Override
	public void run() {
		System.out.println("run");
	}

	@Override
	public void start() {
		System.out.println("start method");
	}
}

public class OverrideStartMethod {
	public static void main(String[] args) {
		System.out.println("Main start");

		MyThread10 mt1 = new MyThread10();
		mt1.start();
		System.out.println("Main End");

	}

}

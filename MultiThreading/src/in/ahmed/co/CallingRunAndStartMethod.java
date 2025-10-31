package in.ahmed.co;

class MyThread3 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("run i :" + i);
		}
	}
}

public class CallingRunAndStartMethod {
	public static void main(String[] args) {
		System.out.println("Main start");
		MyThread3 mt1 = new MyThread3();
		mt1.run();
		mt1.start();
		for (int i = 1; i <= 20; i++) {
			System.out.println("Main i :" + i);
		}
		System.out.println("Main End");

	}

}

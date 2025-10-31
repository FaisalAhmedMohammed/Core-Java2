package in.ahmed.co;

class MyThread5 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + ": run i: " + i);
		}
	}
}

public class CreatingMultipleCustomThreads {
	public static void main(String[] args) {
		System.out.println("Main start");

		MyThread5 mt1 = new MyThread5();
		mt1.start();
		MyThread5 mt2 = new MyThread5();
		mt2.start();
		System.out.println("Main End");
	}

}

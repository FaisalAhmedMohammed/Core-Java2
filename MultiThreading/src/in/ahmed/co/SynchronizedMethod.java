package in.ahmed.co;

class Addition {
	private int x;
	private int y;

	void add(int x, int y) {
		this.x = x;
		this.y = y;

		int result = x + y;
		System.out.println("result is  : " + result + " ---- "+Thread.currentThread().getName());
	}
}

class MyThread29 extends Thread {

	private Addition a;

	public MyThread29(Addition a) {
		this.a = a;
	}

	@Override
	public void run() {
		a.add(10, 20);
	}

}

class MyThread30 extends Thread {
	private Addition a;

	public MyThread30(Addition a) {
		this.a = a;
	}

	@Override
	public void run() {
		a.add(50, 50);
	}

}

public class SynchronizedMethod {
	public static void main(String[] args) {

		System.out.println("Main start");

		Addition addition = new Addition();

		MyThread29 mt1 = new MyThread29(addition);

		MyThread30 mt2 = new MyThread30(addition);

		mt1.start();
		mt2.start();

		System.out.println("Main End");

	}

}

package in.ahmed.co;

class MyThread12 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread12  thread start");

		MyThread13 mt2 = new MyThread13();
		mt2.start();

		System.out.println("MyThread12  thread end");
	}
}

class MyThread13 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread13  thread start");

		System.out.println("MyThread13  thread end");
	}
}

public class CreateCustomFromAnotherCustomTh {
	public static void main(String[] args) {
		MyThread12 mt1 = new MyThread12();
		mt1.start();

	}

}

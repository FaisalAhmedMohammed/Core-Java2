package in.ahmed.co;

class MyThread16 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + " " + i);
		}
	}
}

public class ThreadPriority {
	public static void main(String[] args) {

		MyThread16 mt1 = new MyThread16();
		MyThread16 mt2 = new MyThread16();

		System.out.println("mt1 priority is : " + mt1.getPriority());
		System.out.println("mt2 priority is : " + mt2.getPriority());

		mt1.setPriority(9);
		mt2.setPriority(7);

		System.out.println("mt1 priority is : " + mt1.getPriority());
		System.out.println("mt2 priority is : " + mt2.getPriority());

		mt1.start();
		mt2.start();
	}

}

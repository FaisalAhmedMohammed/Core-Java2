package in.ahmed.co;

class Example2 {
	static void m1() {
		Thread thread = Thread.currentThread();
		String the = thread.getName();
		System.out.print(the + " ");

		switch (the) {
		case "main":

			System.out.println("hi");
			break;

		case "Thread-0":
			System.out.println("Hello");
			break;

		case "Thread-1":
			System.out.println("HRU?");
			break;

		default:
			System.out.println("WRU");
			;
		}
	}
}

public class SwitchProgramUsingCurrentObject {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1);

		MyThread21 mt1 = new MyThread21();
		mt1.run();
		mt1.start();

		MyThread21 mt2 = new MyThread21();
		mt2.start();
		
		MyThread21 mt3 = new MyThread21();
		mt3.start();
	}
}

class MyThread21 extends Thread {
	@Override
	public void run() {
		Example2.m1();
	}
}

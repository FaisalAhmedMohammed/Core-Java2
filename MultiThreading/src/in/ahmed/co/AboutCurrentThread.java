package in.ahmed.co;

class Sample {
	static void m1() {

		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
	}
}

public class AboutCurrentThread {
	public static void main(String[] args) {

		Thread th = Thread.currentThread(); //current thread
		System.out.println(th.getId());
		System.out.println(th.getName());
		System.out.println(th.getPriority());

		Sample.m1(); // currently running thread
		System.out.println();

		MyThread18 mt1 = new MyThread18();
		mt1.start();

	}
}

class MyThread18 extends Thread {
	@Override
	public void run() {

		System.out.println(Thread.currentThread()+" <--> " + getName());//currently running thread

	}
}

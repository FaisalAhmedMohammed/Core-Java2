package in.ahmed.co;

class MyThread8 extends Thread {
	@Override
	public void run() {
		int add = 0;
		for (int i = 1; i <= 10; i++) {
			add = add + i;
			System.out.println("add :" + add);
		}
	}

}

class MyThread9 extends Thread {
	@Override
	public void run() {
		int sub = 0;
		for (int i = 1; i <= 10; i++) {
			sub = sub - i;
			System.out.println("sub : " + sub);
		}
	}
}

public class MultipleThreadsWithDiffLogic {
	public static void main(String[] args) {
		System.out.println("Main start");

		MyThread8 mt1 = new MyThread8();
		mt1.start();

		MyThread9 mt2 = new MyThread9();
		mt2.start();
		System.out.println("Main End");
	}

}

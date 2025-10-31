package in.ahmed.co;

class MyThread7 extends Thread {
	private int x;

	public MyThread7(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		for (int i = 1; i <= x; i++) {
			System.out.println(getName() + "run i : " + i);
		}
	}
}

public class MultipleCustomWithDifferenInput {
	public static void main(String[] args) {
		System.out.println("Main start");
		MyThread7 mt1 =new MyThread7(10);
		mt1.start();
		
		MyThread7 mt2 = new MyThread7(20);
		mt2.start();
		System.out.println("Main End");

	}

}

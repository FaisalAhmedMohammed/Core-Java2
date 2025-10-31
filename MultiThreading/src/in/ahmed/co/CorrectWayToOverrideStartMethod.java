package in.ahmed.co;

class MyThread11 extends Thread {

	@Override
	public void run() {
		System.out.println("Run start");
		System.out.println("Run end");
	}

	@Override
	public void start() {
		System.out.println("start method ");
		super.start();
		System.out.println("start End ");

	}
}

public class CorrectWayToOverrideStartMethod {
	public static void main(String[] args) {
		MyThread11 mt1 = new MyThread11();
		mt1.start();
		
	}

}

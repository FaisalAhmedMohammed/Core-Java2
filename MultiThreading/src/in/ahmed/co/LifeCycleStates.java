package in.ahmed.co;

class MyThread14 extends Thread {
	@Override
	public void run() {
		System.out.println("Run start");

		System.out.println("run : " + getState());//Runnable

		try {
			Thread.sleep(2000);// pausing run method so it will enter in to time waiting state
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Run end");

	}
}

public class LifeCycleStates {
	public static void main(String[] args) throws InterruptedException {

		MyThread14 mt1 = new MyThread14();
		System.out.println(mt1.getState());//New state

		mt1.start();
		System.out.println(mt1.getState());//Runnable state

		Thread.sleep(2000);// pausing main method to execute mt1 method

		System.out.println("mt1 thread  :"+mt1.getState());//Timed Waiting state of mt1 thread
		
		Thread.sleep(2000);//pausing main method to resume mt1  and continue
		
		System.out.println("mt1 thread1  :"+mt1.getState());

	}

}

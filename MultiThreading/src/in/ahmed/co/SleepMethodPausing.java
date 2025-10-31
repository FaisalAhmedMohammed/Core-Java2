package in.ahmed.co;

public class SleepMethodPausing {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 20; i++) {//pausing the loop for every iteration
			System.out.println(" run : " + i);
			Thread.sleep(1000);
		}
	}

}

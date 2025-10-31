package in.ahmed.co;

class MyThread4 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("run i :"+i);
		}
	}
}
public class CallingStartAndRunMethod {
	public static void main(String[] args) {
		System.out.println("Main start");
		
		MyThread4 mt1 = new MyThread4();
		mt1.start();
		mt1.run();
		for(int i=1;i<=20;i++) {
			System.out.println("Main i :"+i);
		}
		System.out.println("Main End");
	}

}

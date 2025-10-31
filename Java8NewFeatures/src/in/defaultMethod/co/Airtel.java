package in.defaultMethod.co;

public class Airtel implements Sim {
	@Override
	public void call() {
		System.out.println("Airted  Calling");

	}

	@Override
	public void sms() {
		System.out.println("Airtel SMS");
	}

	@Override
	public void internet() {
		System.out.println("Airtel Internet Services");
	}
}

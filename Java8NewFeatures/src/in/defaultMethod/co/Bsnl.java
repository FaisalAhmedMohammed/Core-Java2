package in.defaultMethod.co;

public class Bsnl implements Sim {

	@Override
	public void call() {
		System.out.println("Bsnl Calling");
	}

	@Override
	public void sms() {
		System.out.println("Bsnl Sms");
	}

}

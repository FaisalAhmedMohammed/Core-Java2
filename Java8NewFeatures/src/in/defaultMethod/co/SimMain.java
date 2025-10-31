package in.defaultMethod.co;

public class SimMain {
	public static void main(String[] args) {
		Airtel airtel = new Airtel();
		airtel.call();
		airtel.sms();
		airtel.internet();

		System.out.println();

		Idea idea = new Idea();
		idea.call();
		idea.sms();
		idea.internet();
		
		System.out.println();
		
		Bsnl bsnl = new Bsnl();
		bsnl.call();
		bsnl.sms();
		bsnl.internet();

	}

}

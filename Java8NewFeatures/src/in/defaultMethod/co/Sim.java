package in.defaultMethod.co;

public interface Sim {
	void call();

	void sms();

	default void internet() {
		System.out.println("4G Internet Service");
	}

}
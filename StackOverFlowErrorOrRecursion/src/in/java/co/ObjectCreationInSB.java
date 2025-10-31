package in.java.co;

public class ObjectCreationInSB {
	static {
		System.out.println("in SB");
		ObjectCreationInSB oc = new ObjectCreationInSB();
	}

	public ObjectCreationInSB() {
		System.out.println("in Constructor");
	}

	public static void main(String[] args) {
		System.out.println("in Main ");
		ObjectCreationInSB oc = new ObjectCreationInSB();
	}

}

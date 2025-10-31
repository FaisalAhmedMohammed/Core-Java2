package in.java.co;

public class CreatingObjectInNSB {

	public CreatingObjectInNSB() {
		System.out.println("in Constructor");
	}

	{
		CreatingObjectInNSB oc = new CreatingObjectInNSB();// here we will get stack over flow error
	}

	public static void main(String[] args) {
		System.out.println("in Main");
		CreatingObjectInNSB oc = new CreatingObjectInNSB();

	}

}

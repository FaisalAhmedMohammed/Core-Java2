package in.ahmed.co;

public class CreatingThreadWithSameName {
	public static void main(String[] args) {

		Thread t1 = new Thread();
		t1.setName("ahmed");
		System.out.println(t1.getName());

		Thread t2 = new Thread();
		t2.setName("ahmed");
		System.out.println(t2.getName());

		Thread t3 = new Thread();
		t3.setName("ahmed");
		System.out.println(t3.getName());

	}

}

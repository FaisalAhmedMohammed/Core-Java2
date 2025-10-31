package in.ahmed.co;

public class AssignThreadNames {
	public static void main(String[] args) {

		Thread t1 = new Thread();
		System.out.println(t1.getName());

		Thread t2 = new Thread();
		System.out.println(t2.getName());

		Thread t3 = new Thread();
		System.out.println(t3.getName());

		t3.setName("child3");
		System.out.println(t3.getName());

		Thread t4 = new Thread();
		t4.setName("child4");

		System.out.println(t4.getName());
	}

}

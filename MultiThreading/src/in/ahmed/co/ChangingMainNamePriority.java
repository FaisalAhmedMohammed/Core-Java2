package in.ahmed.co;

public class ChangingMainNamePriority {
	public static void main(String[] args) {

		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());

		t1.setName("ashok");
		System.out.println("Main thread Name  : " + t1.getName());
		t1.setPriority(7);

		Thread t2 = new Thread();
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
	}

}

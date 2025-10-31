package in.ahmed.co;

public class ThreadGroupClass {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		ThreadGroup tGroup = t1.getThreadGroup();
		System.out.println(tGroup.getName());

		ThreadGroup group = new ThreadGroup("Group#1");
		Thread t2 = new Thread(group, "child1");
		Thread t3 = new Thread(group, "child2");

		System.out.println(t2.getName());
		System.out.println(t2.getThreadGroup().getName());

		System.out.println(t3.getName());
		System.out.println(t3.getThreadGroup().getName());
	}

}

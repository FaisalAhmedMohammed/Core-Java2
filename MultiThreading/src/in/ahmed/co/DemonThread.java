package in.ahmed.co;

public class DemonThread {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		boolean daemon = thread.isDaemon();
		System.out.println(daemon);
		
		Thread t1 = new Thread();
		System.out.println(t1.getName() + " thread is a  : " + (t1.isDaemon() ? 
				" Daemon " : " non - Deamon " ) + " thread ");
		
		t1.setDaemon(true);
		t1.start();
		//t1.setDaemon(true);
		System.out.println(t1.getName() + " thread is a : " + (t1.isDaemon() ?
				" Daemon " : " non - Daemon ") + " thread ");
	}

}

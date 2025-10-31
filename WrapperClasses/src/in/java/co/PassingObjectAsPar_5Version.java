package in.java.co;

public class PassingObjectAsPar_5Version {
	static void m1(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		
		m1(10);
		m1(20L);
		m1(10.0);
		
	}

}

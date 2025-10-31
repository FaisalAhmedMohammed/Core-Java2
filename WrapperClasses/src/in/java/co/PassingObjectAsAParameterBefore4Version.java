package in.java.co;

public class PassingObjectAsAParameterBefore4Version {
	static Object m1(Object obj) {
		System.out.println(obj);
		return obj;

	}

	public static void main(String[] args) {
		Object o1 = m1(new Integer(10));
		Object o2 = m1(new Long(20L));
		Object o3 = m1(new Double(30.5));
		// this is not readable code every time it creates new object
		// System.out.println(o1);
	}

}

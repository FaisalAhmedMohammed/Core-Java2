package in.java.co;

import java.util.ArrayList;

public class CollectionCode {
	private static final Object Integer = null;

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Integer(10));
		al.add(new Long(123345677L));
		al.add(new Double(10.0));
		al.add(new Character('a'));
		al.add(new Boolean(true));

		Object object = al.get(0);
		Integer i1 = (Integer) object;
		int intValue = i1.intValue();
		System.out.println(intValue);

	}

}

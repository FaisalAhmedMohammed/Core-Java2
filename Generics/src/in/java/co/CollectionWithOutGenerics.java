package in.java.co;

import java.util.ArrayList;

public class CollectionWithOutGenerics {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Integer(10));
		al.add(new String("Hello"));
		al.add(new Double(10.0));
		al.add(new Boolean(true));
		al.add(new Character('a'));

		for (Object object : al) {
			System.out.println(object);
		}

	}

}

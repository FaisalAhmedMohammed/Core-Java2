package in.java.co;

import java.util.ArrayList;

public class CollectionWithGenerics {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(39);
		al.add(40);
		al.add(50);

		for (Integer integer : al) {
			System.out.println(integer);
		}
	}

}

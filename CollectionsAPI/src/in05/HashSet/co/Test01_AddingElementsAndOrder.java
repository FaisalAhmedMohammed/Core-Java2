package in05.HashSet.co;

import java.util.HashSet;
import java.util.Set;

public class Test01_AddingElementsAndOrder {
	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<Integer>();
		System.out.println(hs.size());
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(10);
		System.out.println(hs.size());

		hs.forEach(ele -> System.out.print(ele + " "));
	}

}

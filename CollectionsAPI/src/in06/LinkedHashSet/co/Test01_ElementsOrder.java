package in06.LinkedHashSet.co;

import java.util.LinkedHashSet;

public class Test01_ElementsOrder {
	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		lhs.add(10);

		System.out.println(lhs.size());

		lhs.forEach(System.out::println);

	}

}

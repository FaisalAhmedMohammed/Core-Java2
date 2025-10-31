package in07.TreeSet.co;

import java.util.Set;
import java.util.TreeSet;

public class Test01_TreeOrder {
	public static void main(String[] args) {
		Set<Integer> tree = new TreeSet<Integer>();
		tree.add(10);
		tree.add(20);
		tree.add(30);
		tree.add(40);
		tree.add(50);
		tree.add(10);
		// tree.add(null);

		tree.forEach(System.out::println);
	}

}

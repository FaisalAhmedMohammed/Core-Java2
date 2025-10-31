package in05.HashSet.co;

import java.util.HashSet;
import java.util.Set;

public class Test03_FIndingUnionIntersection {
	public static void main(String[] args) {
		Set<Integer> h1 = new HashSet<>();
		Set<Integer> h2 = new HashSet<>();

		h1.add(10);
		h1.add(12);
		h1.add(9);
		h1.add(15);

		h2.add(9);
		h2.add(15);
		h2.add(20);
		h2.add(25);

		h1.forEach(System.out::println);
		String sys = "=".repeat(50);
		System.out.println(sys);
		h2.forEach(System.out::println);
		System.out.println(sys);

		System.out.println("finding union of elements");

		Set<Integer> h3 = new HashSet<Integer>();

		h3.addAll(h1);
		h3.addAll(h2);

		System.out.println(sys);
		h3.forEach(System.out::println);

		System.out.println(sys);
		System.out.println("Finding intersection of elements");
		System.out.println(sys);

		Set<Integer> h4 = new HashSet<>();
		h4.addAll(h1);
		h4.retainAll(h2);

		h4.forEach(System.out::println);

		System.out.println(sys);
		System.out.println("Finding the difference Between two sets in forward ");
		System.out.println(sys);

		Set<Integer> h6 = new HashSet<Integer>();

		h6.addAll(h1);
		h6.removeAll(h2);

		h6.forEach(System.out::println);
		System.out.println(sys);
		System.out.println("Finding the difference Between two sets in Backward ");
		System.out.println(sys);

		Set<Integer> h5 = new HashSet<Integer>();
		h5.addAll(h2);
		h5.removeAll(h1);

		h5.forEach(System.out::println);
	}

}

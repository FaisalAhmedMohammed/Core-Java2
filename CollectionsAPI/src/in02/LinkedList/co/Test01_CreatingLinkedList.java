package in02.LinkedList.co;

import java.util.Iterator;
import java.util.LinkedList;

import in03.Vector.co.Student;

public class Test01_CreatingLinkedList {
	public static void main(String[] args) {
		LinkedList<Object> lst = new LinkedList<Object>();
		System.out.println(lst.size());
		System.out.println(lst);
		System.out.println(lst.isEmpty());

		lst.add("a");
		lst.add("b");

		lst.add("a");
		lst.add("b");
		lst.add(true);
		lst.add(null);
		lst.add(null);
		lst.add(97);

		lst.add(new Student(101, 5));
		lst.add(new Student(102, 4));
		System.out.println(lst.size());
		System.out.println(lst);
		System.out.println(lst.isEmpty());
		System.out.println();

		System.out.println(lst.contains(97));
		System.out.println(lst.contains("a"));
		System.out.println(lst.contains(new Student(101, 5)));

		System.out.println();

		System.out.println(lst.indexOf(97));
		System.out.println(lst.indexOf("b"));

		System.out.println();

		System.out.println(lst.get(9));

		System.out.println();
		System.out.println(lst.remove(9));

		System.out.println();

		System.out.println(lst.set(0, "f"));
		System.out.println();

		for (Object object : lst) {
			System.out.print(object + " , ");
		}

		System.out.println();

		Iterator<Object> iterator = lst.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.print(next+ " , ");
		}

	}

}

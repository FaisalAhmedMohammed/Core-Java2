package in01.ArrayList.co;

import java.util.ArrayList;

import in03.Vector.co.Student;

public class Test01_CreateArrayList {
	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<Object>();

		System.out.println("Size : " + al.size());
		System.out.println("Elements : " + al);

		System.out.println();

		al.add("a");
		al.add("b");

		al.add("a");
		al.add("b");

		al.add(5);
		al.add(7.7);
		al.add(7.7);
		al.add(null);
		al.add(null);
		al.add(new Student(10, 10));

		System.out.println("Size : " + al.size());
		System.out.println("Elements : " + al);

		System.out.println();

		al.add(new Student(10, 10));

		System.out.println("Size : " + al.size());
		System.out.println("Elements : " + al);

		System.out.println();

		// random access elements

		System.out.println(al.get(4));
		System.out.println(al.get(9));

		System.out.println();
		System.out.println();

		// sequence access

		for (Object object : al) {
			System.out.print(object + " , ");
		}
		System.out.println();
		System.out.println();

		// using lambda

		al.forEach(System.out::print);

		System.out.println();
		System.out.println();

		al.forEach(ele -> System.out.print(ele + " , "));

		System.out.println();
		System.out.println();

		// using stream

		al.stream().forEach(ele -> System.out.print(ele + " , "));

	}

}

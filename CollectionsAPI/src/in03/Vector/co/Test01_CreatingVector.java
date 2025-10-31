package in03.Vector.co;

import java.util.Vector;

public class Test01_CreatingVector {
	public static void main(String[] args) {

		Vector<Object> vector = new Vector<Object>();
		System.out.println("size : " + vector.size());
		System.out.println("Capacity : " + vector.capacity());
		System.out.println("Elements : " + vector);
		System.out.println();

		vector.addElement("a");
		vector.addElement("b");

		vector.addElement("a");
		vector.addElement("b");

		vector.addElement(5);
		vector.addElement(5.7);
		vector.addElement(true);
		vector.addElement(5);
		vector.addElement(null);
		vector.addElement(new Student(6, 7));

		System.out.println("size : " + vector.size());
		System.out.println("Capacity : " + vector.capacity());
		System.out.println("Elements : " + vector);

		System.out.println();
		System.out.println();
		vector.addElement(new Student(6, 7));
		vector.addElement(null);
		vector.addElement(null);

		System.out.println("size : " + vector.size());
		System.out.println("Capacity : " + vector.capacity());
		System.out.println("Elements : " + vector);

		System.out.println();

		// random access
		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + " ");
		}
		System.out.println();
		System.out.println();

		// sequential access
		for (Object object : vector) {
			System.out.print(object + " ");
		}
		System.out.println();
		System.out.println();

		// using for each method
		vector.forEach(System.out::print);

		System.out.println();
		System.out.println();

		// using for each method
		vector.forEach(ele -> System.out.print(ele + "  "));

		System.out.println();
		System.out.println();
		// by using streams
		vector.stream().forEach(System.out::print);

	}

}

package in01.ArrayList.co;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.ArrayList;

import in03.Vector.co.Student;

public class Test02_DifferentOperation {
	public static void main(String[] args) {
		ArrayList<Object> lst = new ArrayList<Object>();
		System.out.println(lst.size());
		System.out.println(lst);
		lst.add("a");
		lst.add("b");

		lst.add("a");
		lst.add("b");

		lst.add(new Student(5, 4));
		lst.add(new Student(10, 10));
		lst.add(5);
		lst.add(true);
		lst.add(null);
		lst.add('p');
		System.out.println(lst.size());
		System.out.println(lst);

		System.out.println();

		for (Object object : lst) {
			System.out.print(object + " , ");
		}
		System.out.println();
		System.out.println();

		lst.forEach(ele -> System.out.print(ele + " , "));
		System.out.println();
		System.out.println();

		System.out.println(lst.contains("s"));
		System.out.println(lst.contains("a"));
		System.out.println(lst.contains(null));
		System.out.println();
		System.out.println(lst.contains(new Student(5, 4).equals(new Student(5, 4))));
	
		System.out.println();
		System.out.println(lst.indexOf("a"));
		System.out.println(lst.indexOf(null));
		System.out.println();
		System.out.println(lst.lastIndexOf("a"));
		System.out.println(lst.indexOf(new Student(5, 4)));
	}

}

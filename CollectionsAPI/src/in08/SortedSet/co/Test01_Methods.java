package in08.SortedSet.co;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test01_Methods {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Mark");
		ts.add("Taylor");
		ts.add("Robert");
		ts.add("Daffy");
		ts.add("Louis");
		ts.add("Allen");
		ts.add("Miller");
		ts.add("Wood");
		
		String first = ts.first();
		System.out.println(first);
		
		String last = ts.last();
		System.out.println(last);
		
		SortedSet<String> subSet = ts.subSet(first, last);
		System.out.println(subSet);
		
		SortedSet<String> headSet = ts.headSet("Mark");
		System.out.println(headSet);
		
		SortedSet<String> tailSet = ts.tailSet("Allen");
		System.out.println(tailSet);

	}

}

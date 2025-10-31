package in10.CollectionOfCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectioOfCollection {
	public static void main(String[] args) {
		Map<String, ArrayList<Student>> map = new HashMap<String, ArrayList<Student>>();

		Student s1 = new Student(101, "ashok", "core java");
		Student s2 = new Student(102, "nivas", "adv java");
		Student s3 = new Student(103, "allen", "oracle");
		Student s4 = new Student(104, "kathey", "springboot");
		Student s5 = new Student(101, "ashok", "core java");
		addStudents(map, s1);
		addStudents(map, s2);
		addStudents(map, s3);
		addStudents(map, s4);
		addStudents(map, s5);

	//System.out.println(map);

		for (Map.Entry<String, ArrayList<Student>> e : map.entrySet()) {
			System.out.println(e.getKey() + " -> ");
			for (Student st : e.getValue()) {
				System.out.println("   " + st);
			}
		}
	}

	public static void addStudents(Map<String, ArrayList<Student>> map, Student s) {
		String course = s.getCourse().toUpperCase();
		if (!map.containsKey(course)) {
			ArrayList<Student> al = new ArrayList<Student>();
			al.add(s);
			map.put(course, al);
		} else {
			ArrayList<Student> al = map.get(course);
			if (!al.contains(s)) {
				al.add(s);
			}
		}

	}

}

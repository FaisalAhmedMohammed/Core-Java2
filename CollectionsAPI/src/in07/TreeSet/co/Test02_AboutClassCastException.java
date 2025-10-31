package in07.TreeSet.co;

import java.util.Set;
import java.util.TreeSet;

public class Test02_AboutClassCastException implements Comparable<Test02_AboutClassCastException> {
	private String firstName;
	private String lastName;
	private int age;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	Test02_AboutClassCastException(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public String toString() {
		return " [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}

	@Override
	public int compareTo(Test02_AboutClassCastException o) {
		return this.getFirstName().compareTo(o.getFirstName());
	}

	public static void main(String[] args) {
		Set<Test02_AboutClassCastException> tree = new TreeSet<Test02_AboutClassCastException>();
		tree.add(new Test02_AboutClassCastException("ashok", "bollepalli", 38));
		tree.add(new Test02_AboutClassCastException("shekhar", "nivas", 45));
		tree.add(new Test02_AboutClassCastException("ravi", "kumar", 32));
		tree.add(new Test02_AboutClassCastException("faisal", "ahmed", 24));
		tree.add(new Test02_AboutClassCastException("robert", "wood", 38));

		tree.forEach(System.out::println);
	}

}

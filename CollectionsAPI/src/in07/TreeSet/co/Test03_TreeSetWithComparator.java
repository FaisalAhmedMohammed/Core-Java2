package in07.TreeSet.co;

import java.util.Comparator;
import java.util.TreeSet;

public class Test03_TreeSetWithComparator {
	private String firstName;
	private String lastName;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Test03_TreeSetWithComparator [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	public Test03_TreeSetWithComparator(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public static void main(String[] args) {
		TreeSet<Test03_TreeSetWithComparator> ts = new TreeSet<>(new FirstNameComparator());

		ts.add(new Test03_TreeSetWithComparator("Robert", "Wood", 42));
		ts.add(new Test03_TreeSetWithComparator("Daffy", "Duck", 29));
		ts.add(new Test03_TreeSetWithComparator("Louis", "Brown", 31));
		ts.add(new Test03_TreeSetWithComparator("Allen", "Wood", 45));

		ts.forEach(System.out::println);

	}
}

class FirstNameComparator implements Comparator<Test03_TreeSetWithComparator> {
	@Override
	public int compare(Test03_TreeSetWithComparator o1, Test03_TreeSetWithComparator o2) {

		int result = o1.getLastName().compareTo(o2.getLastName());
		if (result == 0) {
			 result = o1.getFirstName().compareTo(o2.getFirstName());
		}
		return result;
	}
}

package in.java.co;

public class PartyOrganizer {
	public static void main(String[] args) {
		Student s1 = new Student("ashok", 5.0, 58, 101, "java", 5000);
		System.out.println(s1);

		System.out.println("*".repeat(50));
		Party party = new Party();
		party.eat(s1);

	}

}

package in.java.co;

public class CreatingNSObjectAtClassLevel {

	CreatingNSObjectAtClassLevel cl = new CreatingNSObjectAtClassLevel();

	public CreatingNSObjectAtClassLevel() {
		System.out.println("In Constructor");
	}

	public static void main(String[] args) {
		System.out.println("In Main");
		CreatingNSObjectAtClassLevel ml = new CreatingNSObjectAtClassLevel();

	}

}

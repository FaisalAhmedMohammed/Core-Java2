package in.java.co;

public class Person {

	private static int eyes;
	private static int ears;
	private static int legs;
	private static int hands;

	private String name;
	private double height;
	private double weight;

	static {
		eyes = 2;
		ears = 2;
		legs = 2;
		hands = 2;
	}
	private static int count;
	{
		count++;
	}

	public Person(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public static int getEyes() {
		return eyes;
	}

	public static void setEyes(int eyes) {
		Person.eyes = eyes;
	}

	public static int getEars() {
		return ears;
	}

	public static void setEars(int ears) {
		Person.ears = ears;
	}

	public static int getLegs() {
		return legs;
	}

	public static void setLegs(int legs) {
		Person.legs = legs;
	}

	public static int getHands() {
		return hands;
	}

	public static void setHands(int hands) {
		Person.hands = hands;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public void eat() {
		System.out.println(name + " is eating");
	}

	public void sleep() {
		System.out.println(name + " is sleeping");
	}

	public void learn() {
		System.out.println(name + " is learning");
	}
	@Override
	public String toString() {
		return "Personal Details: \n"+
	               "eyes\t:"+ eyes + "\n"+
	               "ears\t:"+ ears + "\n"+
	               "hands\t:"+ hands + "\n"+
	               "legs\t:"+ legs + "\n"+
	               "Name\t:"+ name + "\n "+
	               "height\t:"+ height+ "\n"+
	               "weight\t"+ weight;
	               
	}

}

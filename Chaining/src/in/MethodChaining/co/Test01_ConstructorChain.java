package in.MethodChaining.co;

public class Test01_ConstructorChain {

	private int id;
	private String name;
	private double marks;

	Test01_ConstructorChain setId(int id) {
		this.id = id;
		//System.out.println(this.getClass().getSimpleName());
		return this;
	}

	Test01_ConstructorChain setName(String name) {
		this.name = name;
		return this;
	}

	Test01_ConstructorChain setMarks(double marks) {
		this.marks = marks;
		return this;
	}

	public String toString() {
		return id + " " + name + " " + marks;

	}

	public static void main(String[] args) {
		Test01_ConstructorChain chain = new Test01_ConstructorChain();
		Test01_ConstructorChain setMarks = chain.setId(101).setName("ashok").setMarks(50.0);
		System.out.println(setMarks);
	}

}

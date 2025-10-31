package in.java.co;

public class StringBasic {
	public static void main(String[] args) {
		String s1 = "ashok";
		System.out.println(s1);// print ln method internally calls to string method

		Example example = new Example(10);
		System.out.println(example);

		Sample sample = new Sample(10, 20);
		System.out.println(sample);

	}

}

class Example {
	private int x;

	Example(int x) {
		this.x = x;
	}
}

class Sample {
	private int x;
	private int y;

	public Sample(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x  value :" + x + ", y value: "+ y;
	}
}

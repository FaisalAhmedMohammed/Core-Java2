package in.java.co;

public class PrePost {
	public static void main(String[] args) {
		int x = 1;
		x++;
		int y = x++ + ++x - x-- + --x;
		System.out.println(x);
		System.out.println(y);
	}

}

package in.java.co;

public class Type<T> {

	public void m1(T t) {
		System.out.println(t.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		Type<Integer> type = new Type<>();
		type.m1(10);
		// type.m1("hello");

		Type<Sample> typee = new Type<>();
		typee.m1(new Sample());
	}

}

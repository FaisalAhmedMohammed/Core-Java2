package in.java.co;

public class CreatingMethodWithGenericTypeParameter<T> {
	public void m1(T t) {
		System.out.println(t);
	}

	public static void main(String[] args) {
		CreatingMethodWithGenericTypeParameter<Integer> met = new CreatingMethodWithGenericTypeParameter<>();
		met.m1(101);

		CreatingMethodWithGenericTypeParameter<String> met1 = new CreatingMethodWithGenericTypeParameter<String>();
		met1.m1("ashokit");
	}

}

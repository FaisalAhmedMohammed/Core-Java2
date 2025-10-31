package in.defaultMethod.co;

public interface ImplementDefaultmethod {
	abstract void m1();

	default void m2() {
		System.out.println("Default method ");
	}
}

class Example implements ImplementDefaultmethod {

	@Override
	public void m1() {
		System.out.println("Example abstract method");
	}

}


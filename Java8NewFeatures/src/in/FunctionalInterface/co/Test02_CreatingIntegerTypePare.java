package in.FunctionalInterface.co;

@FunctionalInterface
public interface Test02_CreatingIntegerTypePare {

	void m1(int a);// this method accept only one type parameter
					// we cannot pass double char int float type parameter
					// we cannot overload this method because it if FI
}

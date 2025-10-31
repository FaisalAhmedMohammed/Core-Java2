package in.DifferentWaysOfUsingLE.co;

public interface Practice01LE2Way {
	int operation(int a, int b);

}

class Practice02LE {
	public void display(int x, int y, Practice01LE2Way Le) {
		int operation = Le.operation(x, y);
		System.out.println(operation);
	}

	public static void main(String[] args) {
		Practice02LE two = new Practice02LE();
		two.display(5, 2, (a, b) -> a + b);
	}
}
/*
 * Main Method
    |
    v
two.display(5, 2, (a, b) -> a + b)
   |       |         |
   |       |         |
   |       |         --> This is the Lambda Expression
   |       |             Compiler converts into:
   |       |             new Practice01LE2Way() {
   |       |                 public int operation(int a, int b) {
   |       |                     return a + b;
   |       |                 }
   |       |             }
   |       v
   |   y = 2
   v
 x = 5
 
		 1)x = 5, y = 2,
		 2)Le = (a, b) -> a + b
		 
		 
		 
		 Call happens:

					Le.operation(x, y)
					   ↓
					Le.operation(5, 2)
					   ↓
					Lambda executes:
					(a, b) -> a + b
					   ↓
					5 + 2 = 7
					
					
					operation = 7
					
					Print → 7
 
 
*/
 
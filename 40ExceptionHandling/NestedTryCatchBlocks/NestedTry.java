public class NestedTry{
    public static void main(String[] args){
	System.out.println("main start");
	try{
		int a = Integer.parseInt(args[0]);
		try{
			int[] arr = new int[a];
		}
		catch(NegativeArraySizeException e){
			System.out.println("Enter only +ve Numbers");
		}
		int b = a + 10;
		System.out.println(a);
		System.out.println(b);
        }
	catch(ArrayIndexOutOfBoundsException ex){
		System.out.println("Enter one integer");
	}
	catch(NumberFormatException ee){
		System.out.println("Enter only ingeter");
	}
	System.out.println("main end");	
    }
}
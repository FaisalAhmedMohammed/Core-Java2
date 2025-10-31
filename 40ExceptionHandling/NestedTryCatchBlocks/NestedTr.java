public class NestedTr{
    public static void main(String[] args){
	try{
		int a = Integer.parseInt(args[0]);
		try{
			int[] arr = new int[a];
			System.out.println("array length :"+ arr.length);
  		}
		catch(NegativeArraySizeException e){
			int[] arr = new int[3];  
		System.out.println("array length :"+ arr.length);
		}
		int b = a + 10;
		System.out.println(a);
		System.out.println(b);
	}
	catch(ArrayIndexOutOfBoundsException ex){
		System.out.println("Enter one integer");
	}
	catch(NumberFormatException ee){
		System.out.println("Enter only integer");
	}
		
    }
}
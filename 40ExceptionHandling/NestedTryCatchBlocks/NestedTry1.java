public class NestedTry1{
    public static void main(String[] args){
	System.out.println("main start");
        try{
		int a = Integer.parseInt(args[0]);
		try{
			int[] arr = new int[a];// here user may enter -ve number
			System.out.println("array index :"+ arr.length);
		}
		catch(NegativeArraySizeException ee){
			int[] ar = new int[3];
			System.out.println("enter only +ve numbers");
			System.out.println("array size is :"+ ar.length);
		}
		int b = a + 10;
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);
	}
	catch(ArrayIndexOutOfBoundsException ex){
		System.out.println("please first integer");
 	}
	catch(NumberFormatException e){
		System.out.println("Enter only integers");
	}
	System.out.println("main end");
    }
}
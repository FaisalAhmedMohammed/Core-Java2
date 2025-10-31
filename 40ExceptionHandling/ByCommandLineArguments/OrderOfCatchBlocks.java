public class OrderOfCatchBlocks{
    public static void main(String[] args){
	try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		System.out.println("Result : "+ c); 
	}
	catch(ArrayIndexOutOfBoundsException ex){
		System.out.println("plese enter two integers");
	}
	catch(NumberFormatException ee){
		System.out.println("Enter only integers");
	}
	catch(ArithmeticException e){
		System.out.println("Do not exter 0 as second integer");
	}
	catch(Exception exe){
		System.out.println("Please Enter integers only");
	}
    }   
}
public class CatchingEcxep{
    public static void main(String[] args){
	try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		System.out.println("Result : " + c);
	}
	catch(ArrayIndexOutOfBoundsException e1){
		System.out.println("please enter two integers");
	}
	catch(NumberFormatException ex){
		System.out.println("Enter only integers");
	}
	catch(ArithmeticException ee){
		System.out.println("Do not enter 0 as second value");
	}
    }
}
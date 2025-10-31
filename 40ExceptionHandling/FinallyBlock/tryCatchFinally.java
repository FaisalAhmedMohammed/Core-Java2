public class tryCatchFinally{
    public static void main(String[] args){
	System.out.println("before try catch");
	try{
	int a = Integer.parseInt(args[0]);
	}
	catch(ArrayIndexOutOfBoundsException ex){
		System.out.println("in try");
	}	
	catch(NumberFormatException e){
		System.out.println("enter all integers");
	}
	finally{
		System.out.println("in finally");
	}
	System.out.println("after try catch");
    }
}
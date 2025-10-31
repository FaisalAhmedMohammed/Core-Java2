public class Return {
    public static void main(String[] args){
	System.out.println("befor t/c/f");
	try{
		int a = Integer.parseInt(args[0]);
		//System.out.println(10/0);
		//System.out.println("in try");
	return;

	}
	catch(ArithmeticException ex){
		System.out.println("in catch");
	}
	finally{
		System.out.println("in finally");
	}
	System.out.println("after t/c/f");
    }
}
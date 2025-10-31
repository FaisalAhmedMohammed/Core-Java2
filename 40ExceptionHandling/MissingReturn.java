public class MissingReturn{
    public static void main(String[] args){
	System.out.println("before t/c/f");
	try{
		System.out.println("in try");
		System.out.println(10/0);
		return;
	}
	catch(ArithmeticException ex){
		System.out.println("in catch");
		System.out.println(ex.getMessage());
	}
	finally{
		System.out.println("in finally");
 	}
    }
}
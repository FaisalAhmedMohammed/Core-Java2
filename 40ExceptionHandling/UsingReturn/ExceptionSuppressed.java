public class ExceptionSuppressed{
    public static void main(String[] args){
	System.out.println("before t/c/f");
	System.out.println(m1());

    }
	static int m1(){
	try{
		System.out.println("in try");
		System.out.println(10/0);
		
	}
	catch(NumberFormatException ex){
		System.out.println("in catch");
	}
	finally{
		System.out.println("in finally");
		return 10;
	}
    }
}
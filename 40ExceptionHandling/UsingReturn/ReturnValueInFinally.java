public class ReturnValueInFinally{
    public static void main(String[] args){
	System.out.println(m1());
    }
        static int m1(){

	System.out.println("befor t/c/f");
	try{
		System.out.println(10/0);
		System.out.println("in try");
	return 5;

	}
	catch(ArithmeticException ex){
		System.out.println("in catch");
	}
	finally{
		System.out.println("in finally");
		return 10;
	}
	System.out.println("after t/c/f");//here we will get error 
	
    }
}
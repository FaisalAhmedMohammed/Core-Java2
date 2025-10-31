public class AboutReturnInTryFinally{
    public static void main(String[] args){
	int x = m1(); 
	System.out.println(x);
    }
    static int m1(){
	try{
		int a = Integer.parseInt("arr"); 
		return 1;
	}
	catch(ArithmeticException ex){	
		return 1;
	}
	finally{
		System.out.println("Hi");
	}
	
    }  
}
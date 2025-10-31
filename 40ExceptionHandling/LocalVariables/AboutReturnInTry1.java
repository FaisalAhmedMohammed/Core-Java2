public class AboutReturnInTry1{
    public static void main(String[] args){
	int x = m1(); 
	System.out.println(x);
    }
    static int m1(){
	try{
		int a = Integer.parseInt("a");
		return 10;
		
	}
	catch(ArithmeticException ex){	
		return 1;
	}
    }  
}
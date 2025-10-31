public class AboutReturnInTry{
    public static void main(String[] args){
	int x = m1(); 
	System.out.println(x);

    }
    static int m1(){
	try{
		return 10;
		
	}
	catch(ArithmeticException ex){	
	}
    }
	
  
}
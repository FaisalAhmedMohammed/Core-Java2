public class MultipleReturn{
    public static void main(String[] args){
	int x = m1();
	System.out.println(x);
	
    }
    static int m1(){
	System.out.println("befor t/c/f");
	try{
		System.out.println("inside try");
		//System.out.println(10/0);
		return 5;
		
	}
	catch(NumberFormatException ex){
		System.out.println("in catch");
	}

	finally{
		System.out.println("in finally");
		
	}
	//System.out.println("after t/c/f");
	
    }
}
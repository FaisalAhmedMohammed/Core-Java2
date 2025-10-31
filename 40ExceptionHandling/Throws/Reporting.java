public class Reporting{
    public static void main(String[] args){
	try{
		m1(10);
	}
	catch(ArithmeticException e){
		System.out.println(e.getMessage());
	}

    }

	static void m1(int n)throws ArithmeticException{
		if(n<=0){
			throw new ArithmeticException("Dont pass _ve integers");
		}
		else{
			System.out.println("Result is :"+ n);
		}
	}
}
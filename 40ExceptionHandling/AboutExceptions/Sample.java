public class Sample{
    public static void main(String[] args){
	System.out.println("Main Start");
	try{
		System.out.println(10/0);
        }
	catch(ArithmeticException ex){
		System.out.println("Don't pass second valuse 0");
	}
    }
}
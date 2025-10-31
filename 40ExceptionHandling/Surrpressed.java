public class Surrpressed{
    public static void main(String[] args){
	int x = m1();
	System.out.println(x);
    }
	static int m1(){
	try{
		return 5;
	}
	catch(ArithmeticException ex){
		return 7;
	}
    }
}
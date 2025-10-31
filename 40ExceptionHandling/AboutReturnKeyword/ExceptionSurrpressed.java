public class ExceptionSurrpressed{
    public static void main(String[] args){
	int x = m1(args);
	System.out.println(x);

    }
    static int m1(String[] args){
	try{
		System.out.println("in try");
		int a = Integer.parseInt(args[0]);
	}
	finally{
		System.out.println("in finally");
		return 10;
	}
    }
}
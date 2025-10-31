public class CorrectWayToAccessVariables{
    public static void main(String[] args){
	m1();
    }
    static void m1(){
	int a= 0;
	try{
		//a = 10;
		a = Integer.parseInt("a");
		System.out.println(a);
	}
	catch(ArithmeticException ex){
		System.out.println(a);
	}
	finally{ 
		System.out.println(a);
	}
    }
}
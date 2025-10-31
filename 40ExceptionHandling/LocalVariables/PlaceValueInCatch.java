public class PlaceValueInCatch{
    public static void main(String[] args){
	m1();
    }
    static void m1(){
	int a;
	try{
		a = 10;
		System.out.println(a);
	}
	catch(ArithmeticException ex){
		a = 20;
		System.out.println(a);
	}
	finally{
		a=30;// this is wrong design 
		System.out.println(a);
	}
    }
}
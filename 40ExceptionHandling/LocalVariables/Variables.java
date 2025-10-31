public class Variables{
    public static void main(){
	m1();
    }
    static void m1(){
	try{
		int a =10;
		System.out.println(a);
	}
	catch(ArithmeticExeption ex){
		System.out.println(a);
	}
	finally{
		System.out.println(a);
	}
    }
}
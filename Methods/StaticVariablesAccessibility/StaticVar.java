public class StaticVar{
	static int a=10;

	static void m1(){
	System.out.println("from m1 " + a);
	}
	static void m2(){
	System.out.println("from m2 " + a);
	}
	public static void main(String[] args){
	System.out.println("from main " + a);
	m1();
	m2();
	
	}
}
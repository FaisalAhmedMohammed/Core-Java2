public class StaticInLocalMethod{
	static int a=20;

	static void m1(){
	System.out.println("From m1 "+ a);
      }
 	void m2(){
	System.out.println("From m2 "+ a);
	System.out.println(m1());
   }
	public static void main(String[] args){
	m1();
	StaticInLocalMethod str = new StaticInLocalMethod();
	str.m2(); 
	}
}
public class Static {
	static int a=10;
	static int b=20;

	static void m1(){
	a=50;

       }
	static void m2(){
	System.out.println("From m2 "+ a);

      }
	public static void main(String[] args){
	System.out.println("From main "+ a);
	m2();
	System.out.println("=".repeat(30));
	m1();
	System.out.println("=".repeat(30));
	System.out.println("From main "+ a);
	m2();
	}
}
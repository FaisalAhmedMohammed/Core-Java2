public class Scope{

	public static void main(String[] args){
	//m1(); // error cannot find symbol
	StaticScope.m1();

	System.out.println("*".repeat(40));

	StaticScope ss = new StaticScope();
	ss.m1();

	System.out.println("*".repeat(40));

        StaticScope s2 = null;
	s2.m1();
	
	}
}
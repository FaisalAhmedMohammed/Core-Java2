public class Example {
	static int a=10;
	int x = 30;
	
	public static void main(String[] args){
	
	Example e1 = new Example();
	Example e2 = new Example();
	Example e3 = e2;
	
	System.out.println(e1.a +" " + e2.a + " " + e3.a);
	System.out.println(e1.x +" " + e2.x + " " + e3.x);

	System.out.println("*".repeat(40));

	e1.a=111;
	e2.x=7;
	System.out.println(e1.a +" " + e2.a + " " + e3.a);
	System.out.println(e1.x +" " + e2.x + " " + e3.x);
	}

}
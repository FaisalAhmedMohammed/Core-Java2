public class StaticModification {
	static int a=10;
	int x=20;
	
	public static void main(String[] args){
	StaticModification  sm = new StaticModification();
	StaticModification  sm2 = new StaticModification ();
	System.out.println(sm.a + " " + sm2.a);
	System.out.println(sm2.x +" " + sm2.x);
	
	sm.a=70;
	sm2.x=12;
	System.out.println(sm.a + " " + sm2.a);
	System.out.println(sm.x + " " + sm2.x);
	}

}
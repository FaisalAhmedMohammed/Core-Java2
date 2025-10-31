/static variables we can access in four ways
public class Static {
	static int a=10;
	static int b=20;
	
	public static void main(String[] args){
	System.out.println(a);
	System.out.println(Static.a);
	
	Static sta = new Static();
	System.out.println(sta.a);

	Static str = null;
	System.out.println(str.a);

      }	
}
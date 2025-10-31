public class NSV{
    int x=10;
    void m1(){
	int x=20;
	System.out.println(x);
	System.out.println(this.x);
    }
    public static void main(String[] args){
	NSV ns = new NSV();
	ns.m1();
	//System.out.println(ns.x);
    }
}
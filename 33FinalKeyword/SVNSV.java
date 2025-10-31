public class SVNSV{
   final static int x=2;
    //final int a;
    void m1(final int q){
	final int p;
	System.out.println(x);
	System.out.println(q);
	System.out.println(p);
    }
    public static void main(String[] args){
	SVNSV ss = new SVNSV();
	ss.m1(10);
    }
}
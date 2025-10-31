public class A{
    static final void m1(){
	System.out.println("A m1() SF");
    }
    final void m2(){
	System.out.println("A m2() NSF");
    }

    static void m3(){
	System.out.println("A m3() SNF");
    }
    void m4(){
	System.out.println("A m4() NSNF");
    }
}
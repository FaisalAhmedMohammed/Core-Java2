class A1{
    static int a=10;
    int b=20;
}

public class B1 extends A1{
    static int a=50;
    int b=60;

    void m1(){
	System.out.println(a);
	System.out.println(b);
    }
   
   
    public static void main(String[] args){
	B1 be = new B1();
	be.m1();
	//be.m2();

	A1 a = be;
        B1 b=(B1)a;
	//a.m2();
	System.out.println(a.b);
    }
}
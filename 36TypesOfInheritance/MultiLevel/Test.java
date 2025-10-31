class A{
    void m1(){
	System.out.println("A m1()");
    }
    void m2(){
	System.out.println("A m2()");
    }
}
class B extends A{
    void m1(){
	System.out.println("B m1()");
    }
}
class C extends B{
    void m1(){
	System.out.println("C M1()");
    }
    void m3(){
	this.m1();
	super.m1();
	super.m2();
    }
}
public class Test{
    public static void main(String[] args){
	C a = new C();
	a.m1();
	a.m3();
	
    }
}
class A{
    static int x=10;
    int a=10;
    static void demo(){
	System.out.println("This is parent Demo");
	System.out.println(x);
    }
    void m1(){
	a=2;
	System.out.println("A m1()");
	System.out.println(a);
    }
}
class B extends A{
    void m1(){
	x=50;
	a=2;
	System.out.println("B m1()");
	System.out.println(x);
	System.out.println(a);
    }
}
class C extends A{
    void display(){
	System.out.println(x);	
     }
}
public class Test{
    public static void main(String[] args){
	A a = new B();
	a.m1();
    }
}
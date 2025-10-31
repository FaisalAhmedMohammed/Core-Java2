class A{
    void m1(){
   	System.out.println("A m1()");
    }
}
class B extends A{
    void m1(){
	System.out.println("B m1()");
    }
}
public class Test{  
   public static void main(String[] args){
	A a = new B();
	a.m1();
    }
}
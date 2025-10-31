class A {
    public static final void main(String[] args){

	System.out.println("Super Class"); 
    }
}
public class B extends A {

    static{
	System.out.println("static block");
	m1();
	new B().m2();
    }
    static void m1(){
	System.out.println("SC SM()");
    }
    void m2(){
	System.out.println("SC NSM()");
    }
    
}
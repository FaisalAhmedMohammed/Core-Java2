class A{
    void m1(){
	System.out.println("A m1()");
    }
}
class B{
    void m1(){
	System.out.println("B m1()");
    }
}
class C extends A,B{
    void m1(){
	System.out.println("C m1");
    }
    public static void maina(String[] args){
	A a = new C();
    }
}
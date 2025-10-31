package p1;
public class B{
    static void m2(){
	A.m1();
	System.out.println("B m1()");
    }
    public static void main(String[] args){
	B.m2();
    }
}
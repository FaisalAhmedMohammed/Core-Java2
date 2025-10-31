public class A6 extends A5{
    static int m1(){
	System.out.println("with static ");
	return 10;
    }
    public static void main(String[] args){
	A6 a = new A6();
	a.m1();
    }
}
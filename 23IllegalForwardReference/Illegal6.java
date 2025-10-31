public class Illegal6{
    static int a=10;
    static{
        System.out.println("SB");
        System.out.println("a value : "+ a);
	System.out.println("b value : "+ Illegal6.b);
        m1();
    }
    static void m1(){
        System.out.println("SM");
        System.out.println("a value : "+ a);
	System.out.println("b value : "+ b);
    } 
    public static void main(String[] args){
	System.out.println("MM");
        System.out.println("a value : "+ a);
	System.out.println("b value : "+ b);
    }
    static int b=20;
}
public class Illegal3{
    static int a=b;
    static {
        System.out.println("SB");
	System.out.println("a value :"+ a);
	System.out.println("b value :"+ b);
    }
    static int b=10;
    public static void main(String[] args){
        System.out.println("MM");
	System.out.println("a value :"+ a);
	System.out.println("b value :"+ b);
    }
}
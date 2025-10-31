public class Illegal4{
    static int a=Illegal4.b;
    static {
        System.out.println("SB");
	System.out.println("a value :"+ a);
	System.out.println("b value :"+ Illegal4.b);
    }
    static int b=10;
    public static void main(String[] args){
        System.out.println("MM");
	System.out.println("a value :"+ a);
	System.out.println("b value :"+ b);
    }
}
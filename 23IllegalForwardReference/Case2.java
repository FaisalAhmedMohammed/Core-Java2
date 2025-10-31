public class Case2{
    static int a =10;

    static{
        System.out.println("SB");
        System.out.println("a value :" + a);
        System.out.println("b value :" + Case2.b);
         
        b=50;
        System.out.println("b value :" + Case2.b);
    }
   
    public static void main(String[] args){
        System.out.println("MM");
        System.out.println("a value :" + a);
        System.out.println("b value :" + b);
    }
    static int b=20;
}
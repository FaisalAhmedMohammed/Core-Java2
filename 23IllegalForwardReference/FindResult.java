public class FindResult{

    static int a=10;

    static{
        System.out.println("SB");
        System.out.println("a value :" + a);
        System.out.println("b value : "+ FindResult.b);

        b=100;
    }

    static int b;

    public static void main(String[] args){
         System.out.println("MM");
    }
}
public class MultipleSV{
    static int a=10;
    static{
        System.out.println("SB1");
    }
    static int b=20;
    static{
         System.out.println("SB2");
    }
    public static void main(String[] args){
         System.out.println("MM start");
         System.out.println("a : "+ a);
         System.out.println("b : "+ b);
         System.out.println("MM End");
    }
}
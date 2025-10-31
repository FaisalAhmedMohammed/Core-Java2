public class SVAndBlock{
    static int a=10;
    static{
        System.out.println("SB1");
    }
    public static void main(String[] args){
        System.out.println("MM Start");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
        System.out.println("MM End");
    }
    static{
        System.out.println("SB2");
    }
    static int b=20;
}
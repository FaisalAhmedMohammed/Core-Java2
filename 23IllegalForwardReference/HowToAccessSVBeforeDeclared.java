public class HowToAccessSVBeforeDeclared{
    static int a = 10;
    static{
        System.out.println("SB");
        System.out.println("a value : " + a);
        System.out.println("b value : " + HowToAccessSVBeforeDeclared.b);
    }
    static int b=20;
    public static void main(String[] args){
        System.out.println("MM");
    }
}
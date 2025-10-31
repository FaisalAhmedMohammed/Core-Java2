public class Example{
    static int a = new Example();
    static{
        System.out.println("SB");
    }
    {
        System.out.println("NSB"); 
    }
    Example(){
        System.out.println("NPM");
    }
    public static void main(){
        System.out.println("MM");
        Example ex = new Example();
    }
    static int b = 20;
    int x = 10;
}
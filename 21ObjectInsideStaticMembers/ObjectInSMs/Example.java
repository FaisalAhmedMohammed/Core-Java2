public class Example{
    static Example  e1 = new Example();
    static{
        System.out.println("SB");
    }
    {
        System.out.println("NSB"); 
    }
    Example(){
        System.out.println("NPM");
    }
    public static void main(String[] args){
        System.out.println("MM");
        Example ex = new Example();
    }
    static int b = 20;
    int x = 10;
}
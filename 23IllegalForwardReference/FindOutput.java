public class FindOutput{
    static int a=10;
    static{
        System.out.println("SB");

        System.out.println("a value is : " + a);

        System.out.println("b value is : " +FindOutput.b);
        b=50;
    }
    static int b=20; 
    public static void main(String[] args){
        System.out.println("MM");
        System.out.println("a value is :"+ a);
        System.out.println("b value is :"+ b);
    }
}
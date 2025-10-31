public class Illegal2{
    static int a=10;
    static int b=a;
    static int c=Illegal2.d;
    static int d=40;

    public static void main(String[] args){
        System.out.println("MM");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
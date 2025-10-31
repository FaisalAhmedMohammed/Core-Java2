public class Example1{
    private static void m1(){
        System.out.println("m1() Private Method");
    }
    public static void m2(){
        System.out.println("m2() Method");
    }
    public static void main(String[] args){
        m1();
        m2();
        System.out.println("*".repeat(50));
        m3();
    }
    public static void m3(){
        System.out.println("m3() Method");
        m1();
    }
}
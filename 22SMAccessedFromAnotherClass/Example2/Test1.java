public class Test1{
    static int a = m1();
    static int m1(){
        System.out.println("SM m1()");
        return 5;
    } 
    static{
        System.out.println("SB");
    }
    static void m2(){
        System.out.println("SM m2()");
    }
    public static void main(){
        System.out.println("MM");
    }
}
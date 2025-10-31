public class PrivateMethod{
    private static void m1(){
        System.out.println("Private method m1()");
    }
    static void m2(){
        System.out.println("Default Method m2()");
    }
    public static void main(String[] args){
    m1();
    m2();
    //m3();
    }
    static void m3(){
        System.out.println("Default Method m3()");
        m1();
    }
}
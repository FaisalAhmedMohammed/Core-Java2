public class Void_NonVoid{
    static void m1(){
        System.out.println("Void Method");
    }
    static int m2(){
        return 5;
    }
    public static void main(String[] args){
        m1();
        System.out.println(m2());
    }
}
public class CallingNonVoidMethods{
    public static int m1(){
        System.out.println("m1() Non Void Method");
        return 5;
    }
    static int m2(){
        System.out.println("m2() method");
        return m1();
    }
    public static void main(String[] args){ 
        m1();
        System.out.println("*".repeat(40));
        int a = m1();
        System.out.println(a);
        System.out.println("*".repeat(40));
        int b = (10 * m1());
        System.out.println(b);
        System.out.println("*".repeat(40));
        System.out.println(m2());
        
   }
}
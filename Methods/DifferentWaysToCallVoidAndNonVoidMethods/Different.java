public class Different{
    static void m1(){
        System.out.println("m1()");
    }
    static int m2(){
         System.out.println("m2()");
        return 5;
    }
    public static void main(String[] args){
        //m1();
        //System.out.println(m2());

        System.out.println("*".repeat(40));

        int a = m2();
        System.out.println(a); 
        System.out.println("*".repeat(40));
    
        int b = 10 * m2();
        System.out.println(b);
    }
}
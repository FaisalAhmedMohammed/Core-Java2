public class Test4 {
    static int a=10;
    public static void main(String[] args){
        int a=50;
        System.out.println("Local variable a :"+a);
        System.out.println("Static variable Shadowing : "+Test4.a);
    }
}
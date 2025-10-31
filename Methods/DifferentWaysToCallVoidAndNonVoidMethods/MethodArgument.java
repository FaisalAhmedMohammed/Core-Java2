public class MethodArgument{
    public static int m1(){
        System.out.println("m1() Method");
        return 5;
    }
    public static void m2(int a){
        System.out.println("m2() Method");
    } 
    public static void main(String[] args){
        System.out.println("Main Start");
        m2(m1());
        System.out.println("Main End");
    }
}
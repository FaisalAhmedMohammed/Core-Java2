public class MethodAsArgument{
    static int m1(){
        System.out.println("m1()");
            return 5;
    }
    static void m2(int a){
        System.out.println("m2 () " + a);

    } 
    public static void main(String[] args){
        m2(m1());
    }
}
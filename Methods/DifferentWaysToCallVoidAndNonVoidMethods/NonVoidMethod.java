public class NonVoidMethod{
    static int m1(){
        System.out.println("m1()");
            return 5;
    }
    public static void main(String[] args){
    m1();
    System.out.println(m3());
    }
    static int m3(){
        return m1();
    }
}
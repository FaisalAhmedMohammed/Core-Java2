public class Test2{
    static int a = m1();
    
    static int m1(){
        System.out.println("Static method");
        return 5;
    }
    public static void main(String[] args){
        System.out.println("Main Method");
       // m1();
    }
}
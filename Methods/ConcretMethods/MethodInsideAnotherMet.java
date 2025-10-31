// no we cant create method inside another method we will get compile time error
public class MethodInsideAnotherMet{
    static void m1(){
        static void m2(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args){
        m1();
    }
}
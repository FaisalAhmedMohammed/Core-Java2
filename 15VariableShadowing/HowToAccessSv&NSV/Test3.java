//this program we will get compile time error because we are accissing local variable outside of method
public class Test3 {
    static void m1(){
        int a =10;
    }
    public static void main(String[] args){
        System.out.println("Calling method local variable : "+ a);
    }
}
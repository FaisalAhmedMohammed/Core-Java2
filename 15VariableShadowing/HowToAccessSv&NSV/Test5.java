public class Test5 {
    int a =10;
    void m1(){
        int a=10;
        System.out.println("Method local Variable : "+ a);
        System.out.println(this.a);
    }
    public static void main(String[] args){
        Test5 test =  new Test5();
        test.m1();
        System.out.println(test.a);
    }
}
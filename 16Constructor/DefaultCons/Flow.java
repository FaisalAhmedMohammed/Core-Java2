public class Flow{
    Flow(){
        System.out.println("Constructor");
    }
    void m1(){
        System.out.println("Method");
    }
    public static void main(String[] args){
        System.out.println("Main");
        Flow flow = new Flow();
        flow.m1();
    }
}
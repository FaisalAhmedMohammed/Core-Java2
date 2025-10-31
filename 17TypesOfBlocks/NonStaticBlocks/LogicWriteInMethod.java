public class LogicWriteInMethod{
    void m1(){
        System.out.println("Hello");
    }
    LogicWriteInMethod(){
        m1();
        System.out.println("NPC");
    }
     LogicWriteInMethod(int a){
        m1();
        System.out.println("IPC");
    }
     LogicWriteInMethod(String str){
        m1();
        System.out.println("SPC");
    }
    public static void main(String[] args){
        LogicWriteInMethod logic1 = new LogicWriteInMethod();
        LogicWriteInMethod logic2 = new LogicWriteInMethod(10);
        LogicWriteInMethod logic3 = new LogicWriteInMethod("Hari");
    }
}
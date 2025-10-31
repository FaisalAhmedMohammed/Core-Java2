public class RecurseiveMethod{
    static int a =10;
    static{
        System.out.println("SB");
    }
  
    static void m1(){
        System.out.println("SM");
        m1();
    }
    public static void main(String[] args){
        RecurseiveMethod.m1();
    }
}
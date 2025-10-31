public class StaticMembers{
    static int a=10;
    static int b=20;

    static{
        System.out.println("SB1");
    }
    static{
        System.out.println("SB2");
    }
    public static void main(String[] args){
        System.out.println("MM");
    }
        static void m1(){
            System.out.println("Static Method");
        
    }
}
public class StaticMembers1{
    static int a = m1();
    static int m1(){
        System.out.println("sc1:a");
            return 50;
    }
    static{
        System.out.println("SB1");
    }
    static int b = m2();
    static int m2(){
        System.out.println("SV2:b");
            return 60;
    }
    static void m4(){
        System.out.println("Sm");
    }
    public static void main(String[] args){
        System.out.println("MM");
    }
    static int c = m3(); 
    static int m3(){
        System.out.println("SV:c");
            return 70;
    }
    static{
        System.out.println("SB2");
    }

}
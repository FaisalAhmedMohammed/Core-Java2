public class ObjecInSM{
    static int a = 10;
    static{
        System.out.println("SB");
    }
    {
        System.out.println("NSB");
    }
    static void m1(){
        System.out.println(" Inside Static Method");
        ObjecInSM sm =  new ObjecInSM();
    }
    ObjecInSM(){
        System.out.println("NPM");
    }
    public static void main(String[] args){
        System.out.println("MM"); 
        ObjecInSM.m1();
    } 
    int x = 10;
}
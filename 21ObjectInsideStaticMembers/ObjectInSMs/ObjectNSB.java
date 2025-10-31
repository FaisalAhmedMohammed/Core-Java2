public class ObjectNSB{
    static int a=10;
    static{
        System.out.println("SB");
    }
    {
        System.out.println("Non Static Block start");
        ObjectNSB nsb = new ObjectNSB();
        System.out.println("Non Static Block start end");
    } 
    ObjectNSB(){
        System.out.println("NPM");
    }
    public static void main(String[] args){
        System.out.println("MM");
        ObjectNSB ss = new ObjectNSB();
    }
    int x=60;
}
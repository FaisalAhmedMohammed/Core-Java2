public class SVExecutedFirst{
    static int a =m1();
    static int m1(){
        System.out.println("SV is Executed");
        return 5;
    } 
    public static void main(String[] args){
       System.out.println("MM start");
       System.out.println("a value : " + a);
       System.out.println("MM End");
     
    }
}
public class MultipleStaticBlock{
    static{
        System.out.println("SB1 executed");
    }
    static{
       System.out.println("SB2 executed");
    }
    public static void main(String[] args){
        System.out.println("MM execution Start");
        System.out.println("MM execution End");    
    }
}
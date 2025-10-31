public class VSInStaticBlock{
    static int a = 10;
    static{
        System.out.println("Block");
        int a=50;
        a=5;
        System.out.println(VSInStaticBlock.a);
        VSInStaticBlock.a=70;
    }
    public static void main(String[] args){
       System.out.println("Main");
       System.out.println(a);
    }
}
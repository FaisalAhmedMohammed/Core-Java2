public class ObjectInSB{
    static int a=10;
    static{
        System.out.println("SB Start"); 
        ObjectInSB sb = new ObjectInSB();
        System.out.println("SB End");
    }
    ObjectInSB(){
        System.out.println("NPM");
    }
    {
        System.out.println("NSB");
    }
    public static void main(String[] args){
        System.out.println("MM");
    } 
    static int b=20;
    int x=10;
}
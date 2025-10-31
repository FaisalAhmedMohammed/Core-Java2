public class ObjectInMM{
    static int a =10;
    int x=40;
    static{
        System.out.println("SB");
    }
    {
        System.out.println("NSB"); 
    }
    ObjectInMM(){
        System.out.println("NPM");
    }
    public static void main(String[] args){
        System.out.println("MM Start");
        ObjectInMM mm = new ObjectInMM();
        System.out.println("MM End");
    }
}
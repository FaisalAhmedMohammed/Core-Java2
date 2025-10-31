public class ObjectSVM{
    static ObjectSVM ob = new ObjectSVM();
    static{
        System.out.println("SB");
    }
    {
        System.out.println("NSB");
    }
    ObjectSVM(){
        System.out.println("NPM");
    }
    public static void main(String[] args){
        System.out.println("MM");
    }
    static int b=20;
    int x=50;
}
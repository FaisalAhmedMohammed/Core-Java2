public class ConstructorRecCall{
    static int a=10;
    static{
        System.out.println("SB");
    }
    ConstructorRecCall(){
        System.out.println("NPM");
        ConstructorRecCall call = new ConstructorRecCall();
    }
    public static void main(String[] args){
        System.out.println("MM");
        ConstructorRecCall c1 = new ConstructorRecCall();
    }
    int x=50;
}
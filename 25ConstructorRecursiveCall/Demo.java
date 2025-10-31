public class Demo{

    static int a=10;
    static{
        System.out.println("SB");
    }
    Demo(){
        System.out.println("NPM");
       // Demo dd = new Demo();
    }
    int x=20;
    {
        System.out.println("NSb");
    }
    void m1(){
        System.out.println("Method");
    }
    public static void main(String[] atgs){
        System.out.println("MM");
        Demo d1= new Demo();
            d1.m1();
        
    }
}
//sb  mm  nsb  npm
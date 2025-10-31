public class VairableShadowInStatic{
    static int a;
    static{
        System.out.println("Static Block");
        int a=19;
        a=50;
    }
    public static void main(String[] args){
        System.out.println("Main");
        System.out.println("a value is : " + a);
    }
}
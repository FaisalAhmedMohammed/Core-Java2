public class IllegalForward {
    static int a = 10;

    static {
        System.out.println("SB");
        System.out.println("a Value : " + a);
        System.out.println("b Value : " + b);    
    }

    static int b = 20;

    public static void main(String[] args) {
        System.out.println("MM");
    }
}

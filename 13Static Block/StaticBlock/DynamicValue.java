import java.util.Scanner;
public class DynamicValue{
    static int a;
    static {
        System.out.println("SB");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value :");
        a = sc.nextInt();
        System.out.println(" Value store in static variable ");        
    }
    public static void main(String[] args){
        System.out.println(" Inside Main Method ");
        System.out.println(" a value is:" + a);
    }
}
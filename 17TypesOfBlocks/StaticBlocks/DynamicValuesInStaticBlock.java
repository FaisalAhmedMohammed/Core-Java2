import java.util.Scanner;
public class DynamicValuesInStaticBlock{
    static int a;
    static{
        System.out.println("Block");
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Value");
        a= sc.nextInt();
    }
    public static void main(String[] args){
        System.out.println("Main");
        System.out.println(a);
    }
}
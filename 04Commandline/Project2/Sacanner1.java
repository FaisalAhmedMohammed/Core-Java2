import java.util.Scanner;

public class Sacanner1 {
       public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter First Number");
       int a =sc.nextInt();
       System.out.print("Enter Second Number");
       int b= sc.nextInt();

      int c= a + b;
      System.out.println("Result is :"+ c); 	
    }
}
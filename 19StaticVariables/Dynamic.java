import java.util.Scanner;
class DynamicValues{
    static int x;

    static{
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter x value");
	x = sc.nextInt();

    } 

    static void m1(){	
	System.out.println("SM");
    }
}
public class Dynamic{
    public static void main(String[] args){
	DynamicValues dv = new DynamicValues();
	dv.m1();
	
    }	
}
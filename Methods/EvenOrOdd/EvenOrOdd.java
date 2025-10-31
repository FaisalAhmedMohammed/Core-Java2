import java.util.Scanner;
public class EvenOrOdd{
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter Number");
	int num = scn.nextInt();
	boolean even = Even.isEven(num);
	if(even)
		System.out.print("The given "+ num +" is Even");	
	else
		System.out.print("The given "+ num +" is odd");
	}
}
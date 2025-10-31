import java.util.Scanner;

public class ReadNumName {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number :");
	int a = sc.nextInt();
	sc.nextLine(); //reading enter key character and making scanner object empry
	System.out.print("Enter Name :");
	String str = sc.nextLine();
	System.out.print("Number : "+ a + " Name is : " +str);
	}
}
import java.util.Scanner;
public class NewTernary {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int num = sc.nextInt();
	System.out.println(num%2==0 ? "Even" : "odd");
	
	}
}
import java.util.Scanner;
public class Percentage {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number:");
	int num = sc.nextInt();
	System.out.print("Enter percentage:");
	int perc = sc.nextInt();
	int res = (num * perc) /100;
	System.out.println("result is: "+ res);
	}
}
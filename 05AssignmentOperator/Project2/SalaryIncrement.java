import java.util.Scanner;
public class SalaryIncrement {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Salary:");
	int sal = sc.nextInt();
	System.out.print("Enter increment:");
	int perc = sc.nextInt();
	int increment = (sal * perc)/100;
	int newSal = sal + increment;
	System.out.print("Salary increased is:"+ newSal); 
	}
}
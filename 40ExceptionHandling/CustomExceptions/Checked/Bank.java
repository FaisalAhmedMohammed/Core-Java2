import java.util.Scanner;
public class Bank{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	try{
		System.out.println("Enter withdraw amount");
		double money = sc.nextDouble();
		double d = Balance.withDraw(money);
		System.out.println(d);
	}
	catch(InsufficientBalanceException ex){
		System.out.println(ex.getMessage());
	}
    }
	
	
}
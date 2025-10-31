public class Bank2{
    void deposit(double cash){
	System.out.println("deposit bank(double) is executed");
    }
    void deposit(String cheque){
	System.out.println("deposit bank(String) is executed");
    }
    void deposit(long accNum1,long accNum2, double amount){
	System.out.println("deposit (transfer) is executed");
    }
}
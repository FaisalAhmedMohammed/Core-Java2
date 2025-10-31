public class Bank{
    void deposit(double cash){
	System.out.println("deposit Bank(double)is executed");
    }
    void deposit(int cash){
	System.out.println("deposti Bank(int)is executed");
    }
    void deposit(String cheque){
 	System.out.println("deposit Bank(String)is executed"); 
    }
    void deposit(long accNum1,long accNum2,double amount){
	System.out.println("deposit Bank(transfer)is executed");
    }
}
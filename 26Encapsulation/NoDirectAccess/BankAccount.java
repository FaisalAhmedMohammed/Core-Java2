public class BankAccount{
    private double balance;

    public void setBalance(double balance){
        if(balance <= 0){
	    System.out.println("Balance should be +Ve");
        }
	else{
	    this.balance=balance;
        }
        
    }
    public double getBalance(){
        return this.balance;
    }

    public static void main(String[] args){
	BankAccount bank = new BankAccount();
	bank.setBalance(-2500);
    }
}
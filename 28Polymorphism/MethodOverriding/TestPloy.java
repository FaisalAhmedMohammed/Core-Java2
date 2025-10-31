public class TestPloy{
    public static void main(String[] args){
    	Bank bank = new Bank();
    	bank.deposit(5000);
	    bank.deposit("5000");
    
	System.out.println("*".repeat(50));
	HDFCBank hd = new HDFCBank();
	hd.deposit(5000);
	hd.deposit("5000");

	System.out.println("*".repeat(50));
	Bank bank2 = new HDFCBank();
	bank2.deposit(5000);
	bank2.deposit("5000");
	//bank2.payIntrest();

	bank2.bankName();
    }
}
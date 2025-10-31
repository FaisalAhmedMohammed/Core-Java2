public class Business {
	private double balance;
	void deposite(double amount){
	balance += amount;
	System.out.println(balance);
	}
	public static void main(String[] args){
	Business bus= new Business();
	bus.deposite(5000);
	}
	
}
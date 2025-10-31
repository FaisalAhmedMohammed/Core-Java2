public class Balance{
	static double balance = 5000;
	static double withDraw(double amount)throws InsufficientBalanceException{
			if(amount >= balance){
				throw new InsufficientBalanceException("withdraw amount is greater then balance"); 
			}
			else{
				balance = balance - amount;
				return balance;
			}
	}
}
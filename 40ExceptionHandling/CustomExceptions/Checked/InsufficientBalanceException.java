public class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(){
		super();
	} 
	InsufficientBalanceException(String msg){
		super(msg);
	}
}
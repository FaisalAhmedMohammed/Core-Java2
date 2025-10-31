public class NonStaticMethod{
    public static void main(String[] args){
        Bank bank = new HdfcBank();
	//bank.deposit();
	bank.deposit(5000);
    }
}
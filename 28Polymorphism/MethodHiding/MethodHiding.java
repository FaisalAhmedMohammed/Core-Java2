public class MethodHiding{
    public static void main(String[] args){
        HDFC hdfc = new HDFC();
	hdfc.bankName();

	Bank bank1 = new HDFC();
	bank1.bankName();
    }
}
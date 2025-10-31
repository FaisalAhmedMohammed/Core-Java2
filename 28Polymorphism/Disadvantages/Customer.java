public class Customer{
    public static void main(String[] args){
        HDFC hdfc = new HDFC();
	hdfc.depositCash(new Cash());

	hdfc.depositCheque(new Cheque());
    }
}
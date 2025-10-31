public class TestPoly1{
    public static void main(String[] args){
	HDFCBank1 hdfc = new HDFCBank1();
	hdfc.deposit(5000);
	hdfc.deposit("5000");
	hdfc.payIntrest();
    }
}
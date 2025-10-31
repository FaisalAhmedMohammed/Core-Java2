public class ThrowKeyword{
    public static void main(String[] args){
		ArithmeticException ex = new ArithmeticException("by 0");
		throw ex;
    }
}
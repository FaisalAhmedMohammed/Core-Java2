public class Additon{
	static int add(int a,int b) throws NegativeNumberException{
		if(a<0 | b<0){
			throw new NegativeNumberException("Dont pass -ve values");
		}
		else{
			int c = a + b;
			return c;
		}
	}
}
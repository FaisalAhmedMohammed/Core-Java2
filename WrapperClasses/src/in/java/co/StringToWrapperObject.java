package in.java.co;

public class StringToWrapperObject {

	public static void main(String[] args) {

		Integer io1 = new Integer("50");// pso as wco
		Integer io2 = io1.valueOf("50");// pso as wco 
		
		System.out.println(io1);
		System.out.println(io2);
		
		int intValue = io2.intValue();
		
		

	}

}

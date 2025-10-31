public class Test{
	static void m1()throws A{
		throw new A("Dont enter negative amount");
	}
 	static void m2(){
		try{
			m1();
		}
		catch (A a) {
    			System.out.println("in catch: " + a.getMessage());
		}

	}
    public static void main(String[] args){
	m2();
    }	
}
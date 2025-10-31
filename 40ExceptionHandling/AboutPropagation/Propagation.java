public class Propagation{
    public static void main(String[] args) {
		m1();
    }
    static void m1() {
        System.out.println("m1 start");
        m2();
	System.out.println("m1 end");
    }
    static void m2(){
	System.out.println("m2 start");
	try{
		m3();
	}
	catch(ArithmeticException ex){
		System.out.println("in catch");	
	}
	System.out.println("m2 end");
    }
    static void m3(){
	System.out.println("m3 start");
	System.out.println(10/0);
	System.out.println("m3 end");
    }
}

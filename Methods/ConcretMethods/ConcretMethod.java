public class ConcretMethod{
    static void m1(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        System.out.println("Hi");
	m1(); // method calling
	System.out.println("HRU");
	m2();
    }
    static void m2(){
        System.out.println("WRU");
    }    
}
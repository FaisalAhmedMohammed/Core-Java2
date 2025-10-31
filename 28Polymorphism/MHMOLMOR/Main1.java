public class Main1{
    public static void main(String[] args){
	B b = new B();
	b.m2();
	b.m2(5000);
	b.m3();
	b.m3("Hello");
	b.m3(45.6f,10);

	System.out.println("*".repeat(50));
	A1 a = new B();
	a.m1();
	a.m2();
	a.m3();
	a.m3(34.f,10);
    }
}
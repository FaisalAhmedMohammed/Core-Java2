public class Test{
    public static void main(String[] args){
	B b = new B();
	b.m1();
	b.m2();
	b.m3();
	b.m4();
	System.out.println("*".repeat(60));
	C c = new C();
	c.m1();
	c.m2();
	c.m3();
	c.m4();
	System.out.println("*".repeat(60));
        D d = new D();
	d.m1();
	d.m2();
	d.m3();
	d.m4();
	System.out.println("*".repeat(60));
	E e = new E();
	e.m1();
	e.m2();
	//e.m3();
	//e.m4();
	System.out.println("*".repeat(60));
	H h = new H();
	h.m3();
	h.m4();

    }
    
}
package p2;
//import p1.A;
import static p1.A.*;
import p1.A;
public class B{
    public static void main(String[] args){
	//A.m1();
	//A.m2();
	
	m1();
	m2();

        A a = new A();
	a.m3();


	A.m1();
	A.m2();
    }
}
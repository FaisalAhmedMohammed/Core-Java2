public class InstanceRecursion{
    void m1(){
	System.out.println("M1() start");
	m1();
	System.out.println("M1() End");
    }
    InstanceRecursion(){
	System.out.println("NPC");
    }
    int a=m2();
    int m2(){
        System.out.println("M2() method");
	return 50;
    }
    public static void main(String[] args){
	InstanceRecursion rec= new InstanceRecursion();
	rec.m1();
    }
}
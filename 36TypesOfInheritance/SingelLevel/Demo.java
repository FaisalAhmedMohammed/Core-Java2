interface I1{
    abstract void m1();
}
interface I2 extends I1{
    abstract void m2();
}
public class Demo implements I1,I2{
   public void m1(){	
	System.out.println("Helolo");
    }
    public void m2(){
	System.out.println("M2()");
    }
    public static void main(String[] args){
	I2 i2 = new Demo();
	i2.m1();
	i2.m2();
    }
}
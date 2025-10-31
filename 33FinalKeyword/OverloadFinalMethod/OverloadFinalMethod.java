public class OverloadFinalMethod{
    static final void m1(){
	System.out.println(" SFNP m1()");
    }
    static final void m1(int x){
	System.out.println(" SFP m1()" + x);
    }
    public static void main(String[] args){
	OverloadFinalMethod load = new OverloadFinalMethod();
	load.m1();
	load.m1(10);

    }    

}
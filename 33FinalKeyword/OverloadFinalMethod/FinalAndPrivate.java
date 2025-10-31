class FinalAndPrivate{
    final void m1(){
	System.out.println("final m1()");
    }

    private void m2(){
	System.out.println("private m2()");
    }
}
public class FP extends FinalAndPrivate{
    //final void m1(){
	//System.out.println("m1");
    //}
    private void m2(){
	System.out.println("Child m2()");
    }
    public static void main(String[] args){
	FP fast = new FP();
	fast.m2();
    }
}
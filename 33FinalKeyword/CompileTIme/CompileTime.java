class CompileTime{
    static void m1(){
	System.out.println("CompileTime SM");
    }
    private void m2(){
	System.out.println("CompileTime PM");
    }
    final void m3(){
	System.out.println("CompileTime FM");
    }
    void m1(int a){
	System.out.println("CompileTime OVLM");
    }
}
public class RunTime extends CompileTime{
    void m1(String s){
	System.out.println("runtime method");
   }
}

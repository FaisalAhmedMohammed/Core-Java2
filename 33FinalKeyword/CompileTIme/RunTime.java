class CompileTime{
    static void m1(){
	System.out.println("CompileTime SM");
    }
    void m2(){
	System.out.println("CompileTime PM");
    }
    final void m3(){
	System.out.println("CompileTime FM");
    }
    void m2(int a){
	System.out.println("CompileTime OVLM");
    }
}
public class RunTime extends CompileTime{
    static void m1(){
	System.out.println("runtime SM");
    }
    void m2(){
	System.out.println("runtime NSM");
    }
    void m2(String s){
	System.out.println("runtime method");
   }
}

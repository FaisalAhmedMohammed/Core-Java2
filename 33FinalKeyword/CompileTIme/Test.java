public class Test{
    public static void main(String[] args){
	CompileTime compile = new RunTime();
	compile.m1();
	compile.m2();
	compile.m3();
	compile.m2(10);
	System.out.println("*".repeat(50));
	CompileTime run = new RunTime();
	run.m1();
	run.m2();
	//run.m2("ahmed");

    }
}
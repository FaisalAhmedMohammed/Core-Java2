public class SFinal{
    static final int x;
    final int z=20;
    static{
	x=10;
    }
    void m1(final int p){
	//x=1;
	//z=2;
	//p=3;
	System.out.println(x);
        System.out.println(z);
	System.out.println(p);
    }
    public static void main(String[] args){
	SFinal fin= new SFinal();
	fin.m1(20);
    }
}
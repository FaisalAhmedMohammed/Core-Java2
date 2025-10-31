public class B1 extends A1{
    B1(){
	super(5);
	System.out.println("B1() NPC");
    }

    B1(int x){
	super();
	System.out.println("B1() IPC");
    }
}
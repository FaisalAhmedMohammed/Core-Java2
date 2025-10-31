interface MyInter{
    void show();
}
public class Example implements MyInter{
    public void show(){	
	System.out.println("Single Level Inheritance");
    }
    public static void main(String[] args){
	MyInter inter = new Example();
	inter.show();
    }
}
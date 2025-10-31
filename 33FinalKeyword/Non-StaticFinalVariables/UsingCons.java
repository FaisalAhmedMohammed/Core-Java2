public class UsingCons{
    final int a =10;
    final int x;
    final int y;

    {
	x=3;
    }
   
    UsingCons(int n){
	y=20;	
	System.out.println(y);
    }
   UsingCons(String s){
	y=3;
	System.out.println(y);
    }
    public static void main(String[] args){
	UsingCons cons = new UsingCons("ahmed");
    }
}
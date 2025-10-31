public class recursiveCalls{
   recursiveCalls(){
	this(10);
	System.out.println("Rec");
    }
    recursiveCalls(int x){
	this();
	System.out.println("Rec");
    }

    public static void main(String[] args){
    recursiveCalls c = new recursiveCalls();
    }
}
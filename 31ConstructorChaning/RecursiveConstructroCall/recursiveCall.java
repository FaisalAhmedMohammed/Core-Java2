public class recursiveCall{
   recursiveCall(){
	this(10);
	System.out.println("Rec");
    }
    recursiveCall(int x){
	this();
	System.out.println("Rec");
    }

    public static void main(String[] args){
    recursiveCall c = new recursiveCall();
    }
}
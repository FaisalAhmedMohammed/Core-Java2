public class RecCall{
    static{
	System.out.println("SB");
	RecCall call = new RecCall();
    }

    RecCall(){
	System.out.println("Constructor");
    }
    public static void main(String[] args){
	System.out.println("MM");
	RecCall c = new RecCall();
   }
}
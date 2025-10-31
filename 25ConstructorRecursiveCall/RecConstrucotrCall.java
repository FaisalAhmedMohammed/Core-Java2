public class RecConstrucotrCall{
    public static void main(String[] args){
	System.out.println("Main Method");
	RecConstrucotrCall c = new RecConstrucotrCall(); 
    }
    int x=m1();
    int m1(){
        System.out.println("M1() method");
        return 5;
    }

    {
	System.out.println("NSB start");
	System.out.println("NSB end");
    }
    RecConstrucotrCall(){
	System.out.println("Constructor Start");
	RecConstrucotrCall call = new RecConstrucotrCall();
    }
}
public class StopRecursion2{
    static int count = 0;
    static void m1(int count){
        if(count !=10){
	    System.out.println("Hello");
            m1(count+1);
        }
	else{
	    return;
       }
    }
    public static void main(String[] args){
        m1(0);
    }
}
public class StopRecursion{
    static int count=0;
    static void m1(){
        if(count >= 10){
            return;
        }
        else{
	    System.out.println("Hello");
            count++;
            m1();
        }
    }
    public static void main(String[] args){
        m1();
    }
}
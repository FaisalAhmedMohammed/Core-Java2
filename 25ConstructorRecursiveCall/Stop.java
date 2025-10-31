public class Stop{
    static int n=0;
    
    static void m1(){
	if(n <10){
        System.out.println("Hello");
	n++;
	m1();
	}
	else{
        return;
	}
    }
    public static void main(String[] args){
        m1();
    }
}
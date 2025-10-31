public class HandleError{
    public static void main(String[] args){
	//m1(-10);
	m1(10);
    }
    static void m1(int a){
	if(a<=0){
		throw new IllegalArgumentException("enter only +ve");
	}
	else{
		System.out.println(a);
	}
    }
}
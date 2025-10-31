public class RecreatingLbVariable{
    static void m1(){
        int p=10;
        {
            int q=12;
	    System.out.println("LocalBlock : " + q);
	}
	    System.out.println("LocalVariable : " + p); 
	    int q=20;
	    System.out.println("LocalVariable 2 :" + q);  
    }
    public static void main(String[] args){
        m1();
    }        
}
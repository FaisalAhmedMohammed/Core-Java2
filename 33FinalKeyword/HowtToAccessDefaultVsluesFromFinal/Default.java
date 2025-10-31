public class Default{
     static {
	
   	 System.out.println(Default.x);    

    }
    static final int x;

    static{
	x=20;
    }
    public static void main(String[] args){

	Default d= new Default();
    }
}
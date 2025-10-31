class Example{
    static int a=10;
    int x;
    
    Example(){
	x=20;
	System.out.println("in constructor"+ this);
    }
   
  
    protected void finalize(){
	System.out.println("In finalize " + this);
    }
}
public class Test{
    public static void main(String[] args){
    	Example e1 = new Example();

	e1= new Example();
	
	e1=null;

        System.gc();
    }
}
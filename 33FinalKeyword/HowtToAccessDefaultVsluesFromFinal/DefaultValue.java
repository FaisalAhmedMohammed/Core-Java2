public class DefaultValue{
    static{
	System.out.println(DefaultValue.x);//RRR rule is applied
    }
    
    static final int x=10;
    public static void main(String[] args){
	DefaultValue defa = new DefaultValue();
	
    }
}
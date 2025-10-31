public class ConvertIntegetToint{
    int x;
    ConvertIntegetToint(int x){
	System.out.println("IPC");
	this.x=x;
    }
      ConvertIntegetToint(Integer x){
	System.out.println("Integer PC");
	this.x=x.intValue();
    }

    public static void main(String[] args){
	ConvertIntegetToint con= new ConvertIntegetToint(10);

	Integer in = 20;
        ConvertIntegetToint con2 = new ConvertIntegetToint(in);
    }
}
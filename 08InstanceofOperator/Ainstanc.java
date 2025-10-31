public class Ainstanc
{
	public static void main(String[] args)
	{
	Ainstanc ins= new Ainstanc();
	System.out.println(ins instanceof Ainstanc);
	String s1= new String();
	System.out.println(s1 instanceof String);
	Object obj = new String();
	System.out.println(obj instanceof String);
	System.out.println(obj instanceof Ainstanc);
	}
}
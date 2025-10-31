public class CompoundOpe 
{
	public static void main(String[] args)
	{
	int a=10;
	a*=a+5;
	System.out.println(a);
	int b=20;
	System.out.println(10.0f < 20);
	System.out.println(10l < 20);
	System.out.println(10.0 < 20);
	System.out.println('a'<'b');
	//System.out.println("a"<"b");
	int[] arr1={3,4,5};
	int[] arr2={4,5,6};
	//System.out.println(arr1 < arr2);
	System.out.println(arr1[0] < arr2[0]);
	}
}
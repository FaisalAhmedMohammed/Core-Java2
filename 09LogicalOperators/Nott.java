//Q: Write a program to print "Access Denied" if isAdmin is not true.
public class Nott
{
	public static void main(String[] args)
	{
		boolean isAdmin=true;
		if(!isAdmin)
		{
		System.out.println("Access  Denied");
		}
		else{
		System.out.println("Access granted");
		}
	}
}
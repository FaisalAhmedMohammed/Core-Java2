public class Demo {

	public static void main(String[] args) {

	int i1= 10;//bg 2 operations are performed 1.creating variable 2.Assignemt 
	String str = "Hello";//bg 3 ope are performed 1.creating variable 2.creating String object 3.assignment
	Example ex = new Example();//bg 3 ope are performed 1.creating variable 2.creating String object 3.assignment
	
	int i2;
	String str2;
	Example ex2;

	i2 = 20;
	str2 = "HK";
	ex2 = new Example();

	System.out.println(i1 + " " + str + " " + ex);
	System.out.println(i2 + " " + str2 + " " + ex2);
	}
}
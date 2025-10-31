package in.CollectionsProblems;

public class Test03_StoresOnlyFixedSizeObjects {
	public static void main(String[] args) {
		Object[] obj = new Object[5];
		obj[0] = "a";
		obj[1] = "b";
		obj[2] = "c";
		obj[3] = "d";
		obj[4] = "e";

		//obj[5] = "f";Here we will get AIOOBE exception to solve this exception we have to create a method
		               // to reuse multiple times

		for (Object object : obj) {
			System.out.println(object);
		}
	} 

}

package in.CollectionsProblems;

public class Test02_StoreAllTypes {
	public static void main(String[] args) {
		double[] arr = new double[5];
		arr[0] = 10;
		arr[1] = 20;
		// arr[2] = "ashok";
		arr[2] = 40.0;
		arr[3] = 233l;
		arr[4] = 'a';

		for (double d : arr) {
			System.out.println(d);
		}

	}

}

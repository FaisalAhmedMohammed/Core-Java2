package in.CollectionsProblems;

public class Test01_StoreOnlyPrimitiveTypeHomo {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		// arr[3] = "hello";
		arr[3] = 40;
		// arr[4]='a';
		for (int i : arr) {
			System.out.println(i);
		}
	}

}

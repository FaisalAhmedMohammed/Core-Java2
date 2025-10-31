package in.CollectionsProblems;

public class Test05_CreatingNewArrayWithInceSize {
	public static void main(String[] args) {
		Object[] obj = new Object[5];
		obj[0] = "a";
		obj[1] = "b";
		obj[2] = "c";
		obj[3] = "d";
		obj[4] = "e";

		Object[] newobj = new Object[6];
		for (int i = 0; i < obj.length; i++) {
			newobj[i] = obj[i];
		}
		obj = newobj;
		obj[5] = "f";

		for (Object object : newobj) {
			System.out.println(object);
		}
	}
}
/*
 * here these is a problem if i want to increase the size to 10 then again i
 * want to repeat the same logic repeating logic is not good programming so we
 * have to use methods write logic only once and reuse it multiple times using
 * methods
 */

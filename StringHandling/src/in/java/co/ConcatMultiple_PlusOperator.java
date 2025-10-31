package in.java.co;

public class ConcatMultiple_PlusOperator {
	public static void main(String[] args) {

		String s1 = "ashok ";
		s1 = s1 + "hyd " + "india";
		System.out.println(s1);

		s1 = s1 + "ameerpet" + "hk";
		System.out.println(s1);

		s1 = s1 + null;
		System.out.println(s1);

		String str = "hk";
		String st = str + "";
		System.out.println(str==st);

	}

}

package in.java.co;

import java.util.Scanner;

public class FindEmptyOrBlank {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter user name");

		String str = sc.nextLine();
		try {
			if (str.isEmpty() | str.isBlank()) {
				throw new Exception("enter user name");
			} else {
				System.out.println("Hi");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

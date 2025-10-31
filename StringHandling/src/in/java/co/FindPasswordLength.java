package in.java.co;

import java.util.Scanner;

public class FindPasswordLength {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Password");

		String password = sc.nextLine();
		try {
			if (password.length() < 8 | password.length() > 12) {
				System.out.println("Enter Password between 8 to 12 digits");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}

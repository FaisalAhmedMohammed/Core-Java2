package in.java.co;

import java.util.Scanner;

public class FindMobileNumberDigit {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Mobile Number");

			String mobile = sc.nextLine();
			try {
				if (mobile.length() > 10) {
					System.out.println("Mobile number is too long enter only 10 digits");
				} else if (mobile.length() < 10) {
					System.out.println("Enter 10 digit mobile Number");

				} else {
					System.out.println("Mobile Number  : " + mobile);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

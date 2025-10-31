package in.java.co;

import java.util.Scanner;

public class VerifyUserNameAndPassword {
	public static void main(String args[]) {
		try {

			String userName = "hari";

			String password = "ashok";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter user Name");
			String name = sc.nextLine();

			System.out.println("Enter Password");

			String pass = sc.nextLine();

			if (name.equals(userName) && password.equals(pass)) {
				System.out.println("Given Name : " + name + "  and  Password is  : " + pass + "  Matched");
			} else {
				throw new Exception("Please enter correct name and password");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

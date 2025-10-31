import java.util.Scanner;
public class Company {
	public static void main(String[] args) {
 	Employee emp = new Employee();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter EmpNo: ");
	emp.empno = sc.nextInt();
	sc.nextLine();
	System.out.print("Enter EmpName: ");
	emp. ename = sc.nextLine();
	System.out.print("Enter EmpRole: ");
	emp.role = sc.nextLine();
	System.out.print("Enter Salary: ");
	emp.sal = sc.nextDouble();
	System.out.print("Enter Email: ");
	emp.email = sc.next();
	System.out.print("Enter Mobile: ");
	emp.mobile = sc.nextLong();
	System.out.print("Enter Gender(M/F): ");
	emp.gender = sc.next().charAt(0);
	System.out.print("Enter Working(Y/N): ");
	emp.working = sc.nextBoolean();
	System.out.println("\n--- Employee Details ---");
	System.out.println("EmpNo: " + emp.empno);
	System.out.println("Name: " + emp.ename);
	System.out.println("Role: " + emp.role);
	System.out.println("Salary: " + emp.sal);
	System.out.println("Email: " + emp.email);
	System.out.println("Mobile: " + emp.mobile);
	System.out.println("Gender: " + emp.gender);
	System.out.println("Working: " + emp.working);

	}
}
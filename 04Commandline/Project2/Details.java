import java.util.Scanner;
public class Details {
	public static void main(String[] args) {
	Student stu = new Student();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Student no\t\t: ");
	stu.sno = sc.nextInt();
	sc.nextLine(); //reading enter char coming from the previous value and making scanner empty and pause the program in the nextLine
	System.out.print("Enter Student Name\t\t: ");
	stu.sname = sc.nextLine();
	System.out.print("Enter Student Course\t\t: ");
	stu.course = sc.nextLine();
	System.out.print("Enter Student Fee\t\t: ");
	stu.fee = sc.nextDouble();
	System.out.print("Enter Student Email\t\t: ");
	stu.email = sc.next();
	System.out.print("Enter Student Mobile\t\t: ");
	stu.mobile = sc.nextLong();
	System.out.print("Enter Student Gender(M/F)\t\t: ");
	stu.gender = sc.next().charAt(0);
	System.out.print("Student studing(true/false): ");
	stu.studingCompleted = sc.nextBoolean();
	
	System.out.println("Number: "+stu.sno);
	System.out.println("Name: "+stu.sname);
	System.out.println("Course: "+stu.course);
	System.out.println("Fee: "+stu.fee);
	System.out.println("Email: "+stu.email );
	System.out.println("Mobile: "+stu.mobile);
	System.out.println("gender: "+stu.gender);
	System.out.println("Studing: "+stu.studingCompleted);
	 
	}
}
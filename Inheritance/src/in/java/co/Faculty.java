package in.java.co;

public class Faculty extends Person {
	private static String company;

	private int empid;
	private String dept;
	private double sal;

	static {
		company = "Ait";
	}

	public Faculty(String name, double height, double weight, int empid, String dept, double sal) {
		super(name, height, weight);
		this.empid = empid;
		this.dept = dept;
		this.sal = sal;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Faculty.company = company;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	public void teaching() {
		System.out.println(getName()+ " is teaching to Students");
	}
	public String toString() {
		return super.toString()+"/n"
				+"Empid\t: "+ empid+"\n"
				+"Dept\t: "+ dept+"\n"
				+"Sal\t: ";
	}

}

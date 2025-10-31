package in.ComparableInterface.co;

public class SortBasedOnNames implements Comparable<SortBasedOnNames> {
	private int empno;
	private String name;
	private double salary;

	public SortBasedOnNames(int empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SortBasedOnNames [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(SortBasedOnNames o) {
		return this.name.compareTo(o.name);
	}

}

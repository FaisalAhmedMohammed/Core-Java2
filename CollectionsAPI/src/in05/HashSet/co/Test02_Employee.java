package in05.HashSet.co;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Test02_Employee {
	private int empno;
	private String name;
	private String dept;
	private double sal;

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getSal() {
		return sal;
	}

	Test02_Employee(int empno, String name, String dept, double sal) {
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Test02_Employee [empno=" + empno + ", name=" + name + ", dept=" + dept + ", sal=" + sal + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(dept, empno, name, sal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test02_Employee other = (Test02_Employee) obj;
		return Objects.equals(dept, other.dept) && empno == other.empno && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
	}

	public static void main(String[] args) {
		Set<Test02_Employee> hs = new HashSet<>();
		hs.add(new Test02_Employee(101, "ashok", "dev", 300000.0));
		hs.add(new Test02_Employee(102, "nivas", "hr", 50000.0));
		hs.add(new Test02_Employee(103, "ravi", "admin", 100000.0));
		hs.add(new Test02_Employee(104, "shekhar", "froentend", 70000.0));
		hs.add(new Test02_Employee(101, "ashok", "dev", 300000.0));
		
		System.out.println(hs.size());

		hs.forEach(System.out::println);
	}

}

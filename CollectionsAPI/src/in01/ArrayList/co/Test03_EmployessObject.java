package in01.ArrayList.co;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test03_EmployessObject {
	private int empNo;
	private String ename;
	private String gender;
	private double yearsInOrg;

	public Test03_EmployessObject() {
	}

	public Test03_EmployessObject(int empNo, String ename, String gender, double yearsInOrg) {
		this.empNo = empNo;
		this.ename = ename;
		this.gender = gender;
		this.yearsInOrg = yearsInOrg;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;

	}

	public int getEmpno() {
		return empNo;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setGender(String gender) {
		this.gender = gender;

	}

	public String getGender() {
		return gender;
	}

	public void setYearsInOrg(double yearsInOrg) {
		this.yearsInOrg = yearsInOrg;
	}

	public double getYearsInOrg() {
		return yearsInOrg;
	}

	public String toString() {
		return empNo + " " + ename + " " + gender + " " + yearsInOrg;
	}

	public static void main(String[] args) {

		ArrayList<Test03_EmployessObject> lst = new ArrayList<>();

		lst.add(new Test03_EmployessObject(101, "ashok", "Male", 2.5));
		lst.add(new Test03_EmployessObject(102, "ravi", "Male", 3.0));
		lst.add(new Test03_EmployessObject(103, "sangitha", "FeMale", 1.2));
		lst.add(new Test03_EmployessObject(104, "kathey", "FeMale", 5.5));
		lst.add(new Test03_EmployessObject(105, "shekhar", "Male", 10.0));
		lst.add(new Test03_EmployessObject(106, "sanjana", "FeMale", 1.2));
		lst.add(new Test03_EmployessObject(107, "ashwani", "FeMale", 2.0));
		lst.add(new Test03_EmployessObject(108, "sneha", "Male", 1.7));
		lst.add(new Test03_EmployessObject(109, "srinivas", "Male", 3.5));
		lst.add(new Test03_EmployessObject(110, "swetha", "FeMale", 2.5));
		lst.add(new Test03_EmployessObject(111, "ahmed", "Male", 4.0));

		Test03_EmployessObject obj = new Test03_EmployessObject();
		List<Test03_EmployessObject> femaleEmployees = obj.findFemaleEmployees(lst);
		for (Test03_EmployessObject test03_EmployessObject : femaleEmployees) {
			System.out.println(test03_EmployessObject);
		}

		System.out.println("*".repeat(50));

		List<Test03_EmployessObject> yearsInOrg2 = findYearsInOrg(lst);
		for (Test03_EmployessObject emp : yearsInOrg2) {
			System.out.println(emp);
		}
	}

	public List<Test03_EmployessObject> findFemaleEmployees(List<Test03_EmployessObject> lst) {

		ArrayList<Test03_EmployessObject> newlst = new ArrayList<Test03_EmployessObject>();

		Iterator<Test03_EmployessObject> iterator = lst.iterator();

		while (iterator.hasNext()) {
			Test03_EmployessObject itr = iterator.next();
			if (itr.getGender().equals("FeMale")) {
				newlst.add(itr);
			}

		}
		return newlst;

	}

	public static List<Test03_EmployessObject> findYearsInOrg(List<Test03_EmployessObject> lst) {

		ArrayList<Test03_EmployessObject> newlst = new ArrayList<>();

		Iterator<Test03_EmployessObject> ite = lst.iterator();
		while (ite.hasNext()) {
			Test03_EmployessObject next = ite.next();
			if (next.getYearsInOrg() <= 2) {
				newlst.add(next);
			}
		}

		return newlst;

	}

}

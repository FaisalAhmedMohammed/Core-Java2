package in.CompratorInterface.co;

import java.util.ArrayList;
import java.util.Collections;

public class Tester {
	public static void main(String[] args) {

		ArrayList<Employee> lstEmp = new ArrayList<>();
		lstEmp.add(new Employee(3432, "ashok", 50000.0));
		lstEmp.add(new Employee(4312, "allen", 43258.0));
		lstEmp.add(new Employee(7654, "miller", 15000.0));
		lstEmp.add(new Employee(7756, "kathey", 25000.0));
		lstEmp.add(new Employee(31234, "david", 20000.0));
		lstEmp.add(new Employee(2134, "nivas", 17000.0));
		lstEmp.add(new Employee(2341, "ahmed", 22000.0));

		Collections.sort(lstEmp, new EmpNoComparator());

		for (Employee employee : lstEmp) {
			System.out.println(employee);
		}

		System.out.println("*".repeat(50));

		ArrayList<Employee> lstEmp1 = new ArrayList<>();
		lstEmp1.add(new Employee(3432, "ashok", 50000.0));
		lstEmp1.add(new Employee(4312, "allen", 43258.0));
		lstEmp1.add(new Employee(7654, "miller", 15000.0));
		lstEmp1.add(new Employee(7756, "kathey", 25000.0));
		lstEmp1.add(new Employee(31234, "david", 20000.0));
		lstEmp1.add(new Employee(2134, "nivas", 17000.0));
		lstEmp1.add(new Employee(2341, "ahmed", 22000.0));

		Collections.sort(lstEmp1, new ENameComparator());

		for (Employee employee1 : lstEmp1) {
			System.out.println(employee1);
		}
		System.out.println("*".repeat(50));

		ArrayList<Employee> lstEmp2 = new ArrayList<>();
		lstEmp2.add(new Employee(3432, "ashok", 50000.0));
		lstEmp2.add(new Employee(4312, "allen", 43258.0));
		lstEmp2.add(new Employee(7654, "miller", 15000.0));
		lstEmp2.add(new Employee(7756, "kathey", 25000.0));
		lstEmp2.add(new Employee(31234, "david", 20000.0));
		lstEmp2.add(new Employee(2134, "nivas", 17000.0));
		lstEmp2.add(new Employee(2341, "ahmed", 22000.0));

		Collections.sort(lstEmp2, new EmpSalComparator());

		for (Employee employee2 : lstEmp2) {
			System.out.println(employee2);
		}
	}
}

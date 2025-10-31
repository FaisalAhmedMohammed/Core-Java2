package in.CompratorInterface.co;

import java.util.Comparator;

public class EmpNoComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEmpno() < o2.getEmpno()) {
			return -1;
		} else if (o1.getEmpno() == o2.getEmpno()) {
			return 0;
		} else
			return 1;
	}
}

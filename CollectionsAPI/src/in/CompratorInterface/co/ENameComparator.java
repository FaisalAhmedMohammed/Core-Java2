package in.CompratorInterface.co;

import java.util.Comparator;

class ENameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
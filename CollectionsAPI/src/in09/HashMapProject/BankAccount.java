package in09.HashMapProject;

public class BankAccount implements Comparable<BankAccount> {
	private int accNo;
	private String accHName;
	private double balance;
	private String branch;

	public BankAccount(int accNo, String accHName, double balance, String branch) {
		super();
		this.accNo = accNo;
		this.accHName = accHName;
		this.balance = balance;
		this.branch = branch;
	}

	public String getAccHName() {
		return accHName;
	}

	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String branch() {
		return branch;
	}

	public void setBranchString(String branch) {
		this.branch = branch;
	}

	public int getAccNo() {
		return accNo;
	}

	@Override
	public int hashCode() {// return common property by which objects are grouped
		// return branch.hashCode();// this is wrong design,because there will be a
		// chance that same
		return BranchMap.getBranchId(branch); // hash code number will be generated for the two different branches
		// so assign branchID to each branch separately by yourself in the
		// program and return the ID from this Hash code
	}

	@Override
	public boolean equals(Object obj) {// compare common property and unique property by which one object is
										// differentiated from another object in this group
		if (obj instanceof BankAccount) {
			BankAccount acc = (BankAccount) obj;
			return this.branch.equals(acc.branch) && this.accNo == acc.accNo;

		}
		return false;
	}

	@Override
	public String toString() {
		return "\nBankAccount [accNo=" + accNo + ", accHName=" + accHName + ", balance=" + balance + ", branch="
				+ branch + "]";
	}

	@Override
	public int compareTo(BankAccount o) {// here i want to sort the object based on branch and account number
											// if branch is same then sort on account number
		int diff = this.branch.compareToIgnoreCase(o.branch);
		if (diff == 0) {// here if two objects are equal than 0

			return this.accNo - o.accNo;
		}
		return diff;
	}

}

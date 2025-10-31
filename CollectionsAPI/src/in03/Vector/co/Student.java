package in03.Vector.co;

public class Student {

	private int roll;
	private int grade;

	public Student(int roll, int grade) {
		this.roll = roll;
		this.grade = grade;
	}

	public void setRoll(int roll) {
		this.roll = roll;

	}

	public int getRoll() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public String toString() {
		return roll + " : " + grade;
	}

}

package in.java.co;

public class Student extends Person {

	private static String institue;

	private int rollNo;
	private String course;
	private double fee;

	static {
		institue = "Ait";
	}

	public Student(String name, double height, double weight, int rollNo, String course, double fee) {
		super(name, height, weight);
		this.rollNo = rollNo;
		this.course = course;
		this.fee = fee;
	}

	public static String getInstitue() {
		return institue;
	}

	public static void setInstitue(String institue) {
		Student.institue = institue;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void read() {
		System.out.println(getName() + " is learning " + course);
	}

	public void write() {
		System.out.println(getName() + " is writing " + course + " notes");
	}

	public void reply() {
		System.out.println(getName() + " is replying to + " + course + "questions");
	}

	public void listen() {
		System.out.println(getName() + " is Listing to + " + course);
	}
	public String toString() {
		return super.toString()+ "\n"+
				"Student Details:\t "+ "\n"+
				"institute:"+institue + "\n"+
				"RollNo\t:"+rollNo + "\n"+
				"Course\t:"+ course + "\n"+
				"Fee\t:"+fee;
	}
}

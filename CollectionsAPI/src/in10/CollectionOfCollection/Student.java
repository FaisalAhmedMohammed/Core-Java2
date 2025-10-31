package in10.CollectionOfCollection;

public class Student {
	private int id;
	private String name;
	private String course;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public Student(int id, String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	@Override
	public int hashCode() {
		return CourseMap.getCousrseId(course);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			return this.id == stu.id && CourseMap.getCousrseId(this.course) == CourseMap.getCousrseId(stu.course);
		}
		return false;
	}

	@Override
	public String toString() {
		return " Student [id=" + id + ", name=" + name + ", course=" + course.toUpperCase() + "]";
	}

}

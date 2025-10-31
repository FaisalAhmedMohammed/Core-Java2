public class Student extends Person{
    private static String institute;
   
    private int rollNo;
    private String course;
    private double fee;
 
    static{
	institute="ait";
    }
    Student(String name,double height,double weight,int rollNo,String course,double fee){
	super(name,height,weight);
	this.rollNo=rollNo;
	this.course=course;
	this.fee=fee;
    }

    public static void setInstitute(String institute){
	Student.institute=institute;
    }
    public static String getInstitute(){
	return institute;
    }
    public void setRollNo(int rollNo){
	this.rollNo=rollNo;
    }
    public int getRollNo(){
	return rollNo;
    }
    public void setCourse(String course){
	this.course=course;
    }	
    public String getCourse(){
	return course;
    }
    public void setFee(double fee){
	this.fee=fee;
    }	
    public double getFee(){
	return fee;
    }
  
    public void listen(){
	System.out.println(getName() + " is Listening");
    }
    public void read(){
	System.out.println(getName() + " is Reading");
    }
    public void write(){
	System.out.println(getName() + " is Writing");
    }
    public void learn(){
	System.out.println(getName() + " is learning");
    }	
@Override
public String toString() {
    return "Student Details:\n" +
           super.toString() +
           "Institute : " + institute + "\n" +
           "Roll No   : " + rollNo    + "\n" +
           "Course    : " + course    + "\n" +
           "Fee       : " + fee       + "\n";
}
  
}

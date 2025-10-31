public class Faculty extends Person{
    private static String company;

    private int empid;
    private String dept;
    private double sal;

    static{
	company="ait";
    }
    Faculty(String name,double height,double weight,int empid,String dept,double sal){
	super(name,height,weight);
	this.empid=empid;
	this.dept=dept;
	this.sal=sal;
    }
    public static void setCompany(String company){
	Faculty.company=company;
    }
    public static String getCompany(){
	return company;
    }	
    public void setEmpid(int empid){
	this.empid=empid;
    }
    public int getEmpid(){
	return empid;
    }
    public void setDept(String dept){
	this.dept=dept;
    }
    public String getDept(){
	return dept;
    }    
    public void setSal(double sal){
	this.sal=sal;
    }
    public double getSal(){
	return sal;
    }
    
  @Override
public String toString() {
    return "Personal Details:\n" +
           super.toString() + "\n" +
           "Company : " + company + "\n" +
           "Emp ID  : " + empid   + "\n" +
           "Dept    : " + dept    + "\n" +
           "Salary  : " + sal     + "\n";
}

}
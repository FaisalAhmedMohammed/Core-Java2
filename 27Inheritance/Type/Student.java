public class Student extends Person{
    static String institute ="AIT";
 
    int rollNo;
    double marks;
    int grade;
   
    public static void main(String[] args){
	Person p = new Student();
	p.setName("ahmed");
	System.out.println(p.getName());
	
    }
       
}
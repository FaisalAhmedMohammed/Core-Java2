public class Employee{
    int eno;
    String ename;
    double sal;
    String dept;
    
    void setEno(int eno){
        this.eno=eno;
    }
    int getEno(){
        return eno;   
    }
    void setEname(String ename){
        this.ename=ename;
    }    
    String getEname(){
        return ename; 
    }
    void setSal(double sal){
        this.sal=sal;
    }
    double getSal(){
        return sal;
    }
    void setDept(String dept){
        this.dept=dept;
    }
    String getDept(){
        return dept;
    }
    void display(){
        System.out.println("Employe No: "+ eno);
	System.out.println("Employe Name: "+ ename);
	System.out.println("Employe Sal: "+ sal);
	System.out.println("Employe Dept: "+ dept);
    }
}
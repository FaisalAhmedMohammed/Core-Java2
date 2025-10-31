public class Student {
    int sno;
    String sname;

    void setSno(int sno){
        this.sno=sno;
    }
    void setSname(String sname){
        this.sname=sname;
    }
    int getSno(int sno){
        return sno;
    }
    String getSname(String sname){
        return sname;
    }
    void display(){
        System.out.println("Student Id: " + sno);
	System.out.println("Student Name: " +sname);
    }
}
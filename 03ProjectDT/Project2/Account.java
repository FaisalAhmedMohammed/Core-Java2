public class Account {
    public static void main(String[] args) {
       Employee  emp = new Employee();
       Employee emp2 =  new Employee();
       emp.empno=101;
       emp.ename="ashok";
       emp.dept="developer";
       emp.sal=50000;

        System.out.println("EmpNo\t: "+emp.empno);
        System.out.println("Ename\t: "+emp.ename);
        System.out.println("Dept\t: "+emp.dept);
        System.out.println("Sal\t: "+emp.sal);
    }
} 
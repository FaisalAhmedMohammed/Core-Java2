public class EmpTest{
    public static void main(String[] args){
        Employee emp = new Employee();
            emp.setEno(101);
	    emp.getEno();
	    emp.setEname("ashok");
	    emp.getEname();
	    emp.setSal(18000);
	    emp.getSal();
	    emp.setDept("IT");
	    emp.getDept();
	    System.out.println("*".repeat(40)); 	
	    emp.display();
	
	    double oldSalary = emp.getSal();
            System.out.println("Old Salary is  : "+ oldSalary);
	
	    System.out.println("*".repeat(40)); 
 
	     double updatedSalary = oldSalary +=oldSalary*20/100;
	        System.out.println("updatedSalary  is  : "+ updatedSalary); 

	  emp.setSal(updatedSalary);
	         System.out.println("*".repeat(40)); 
	  emp.display();
    }
}
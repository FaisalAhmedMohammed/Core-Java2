abstract class CreateConstructor{
    private int id;
    private String name;
    private double sal;

    CreateConstructor(int id,String name,double sal){
	this.id=id;
	this.name=name;
	this.sal=sal;
    }

    abstract void calculateSalary();

    abstract void deductFoodFee();

}
class PartTimeEmpleoyee extends CreateConstructor{
    PartTimeEmpleoyee(int id, String name,double sal){	
	super(id,name,sal);
    } 
    void calculateSalary(){
	System.out.println("PartTime Employee ");
    }
    void deductFoodFee(){
	System.out.println("PartTime FEE");
    }
		
}
class FullTimeEmplelyee extends CreateConstructor{
     FullTimeEmplelyee(int id, String name,double sal){	
	super(id,name,sal);
    } 
    void calculateSalary(){
	System.out.println("FullTimeEmplelyee ");
    }
    void deductFoodFee(){
	System.out.println("FullTimeEmplelyee FEE");
    }
}
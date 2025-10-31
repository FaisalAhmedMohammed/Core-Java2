public class Test{
        public static void main(String[] args){
            Student stu = new Student();
            stu.setSno(10);
	    stu.setSname("Hari");
	    System.out.println("Before Modifing values: ");
            stu.display();
            System.out.println("After Modifing values: ");   
            stu.setSno(12);
	    stu.getSname("ashok");
	    stu.display();
        }
}
public class Test1{
    public static void main(String[] args){
        Example1 ex = new Example1();
	ex.display(); 
        System.out.println("*".repeat(50));
        Example1 ex2 = new Example1(15,16);
        ex2.display(); 
        System.out.println("*".repeat(50));
        ex2.setX(45);
        ex2.setY(55);
        ex2.display();
        System.out.println("*".repeat(50));
        Example1 ex3 = new Example1(ex2);
	ex3.display();
    }
}
public class Example{
    static void m1(){
        System.out.println("static m1()");  
    }
    void m2(){
        System.out.println("Nonstatic m2()");
    }
    public static void main(String[] args){
    m1();
    //m2();	
    
    System.out.println("*".repeat(40));
    Example.m1();
    //Example.m2();
    

    System.out.println("*".repeat(40));
    Example e1 = new Example();
    e1.m1();
    e1.m2();

    System.out.println("*".repeat(40));
    Example e2 = null;
    e2.m1();
    //e2.m2();
    }
}